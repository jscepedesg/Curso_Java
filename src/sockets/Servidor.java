package sockets;

import javax.swing.*;

import java.awt.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.io.*;

public class Servidor  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoServidor mimarco=new MarcoServidor();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}	
}

class MarcoServidor extends JFrame implements Runnable{
	
	public MarcoServidor(){
		
		setBounds(800,200,280,350);				
			
		JPanel milamina= new JPanel();
		
		milamina.setLayout(new BorderLayout());
		
		areatexto=new JTextArea();
		
		milamina.add(areatexto,BorderLayout.CENTER);
		
		add(milamina);
		
		setVisible(true);
		
		Thread hilo = new Thread(this);
		hilo.start();
		}
	
	private	JTextArea areatexto;

	public void run() {
		// TODO Auto-generated method stub
		///System.out.println("Estoy a la escucha");
		
		try {
			//Creacion de socket
			ServerSocket servidor = new ServerSocket(999);
			
			String nink,ip,mensaje;
			ArrayList <String> listaIp = new ArrayList<String>();
			Paquete_envio paquete_recibido;
			
			
			while(true)
			{
				Socket socket = servidor.accept();
				ObjectInputStream paquete_datos = new ObjectInputStream(socket.getInputStream());
				
				paquete_recibido=(Paquete_envio) paquete_datos.readObject();
				
				nink=paquete_recibido.getNick();
				ip=paquete_recibido.getIp();
				mensaje=paquete_recibido.getMensaje();
				
				if(!mensaje.equals("Online"))
				{
					
				areatexto.append("\n"+nink+": "+mensaje+" para "+ip);
				
				
				Socket enviar = new Socket(ip,9090);
				ObjectOutputStream paqueteRenvio = new ObjectOutputStream(enviar.getOutputStream());
				paqueteRenvio.writeObject(paquete_recibido);
				paqueteRenvio.close();
				enviar.close();
				
				/*
				DataInputStream flujo = new DataInputStream(socket.getInputStream());
			
				String mensaje= flujo.readUTF();
			
				areatexto.append("\n"+mensaje);*/
			
				socket.close();
				}
				else
				{
//-------------------------------------Dectecta Online---------------------------------------
					
					InetAddress localizacion = socket.getInetAddress();
					String ip_remo=localizacion.getHostAddress();
					System.out.println("Online: "+ip_remo);
					listaIp.add(ip_remo);
					paquete_recibido.setIps(listaIp);
					
					for (String z : listaIp) {
						
						Socket enviar = new Socket(z,9090);
						ObjectOutputStream paqueteRenvio = new ObjectOutputStream(enviar.getOutputStream());
						paqueteRenvio.writeObject(paquete_recibido);
						paqueteRenvio.close();
						enviar.close();
					}
//---------------------------------------------------------------------------------------------
				}
			}
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}