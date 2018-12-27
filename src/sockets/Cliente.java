package sockets;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

import javax.swing.*;


public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCliente mimarco=new MarcoCliente();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MarcoCliente extends JFrame{
	
	public MarcoCliente(){
		
		setBounds(200,200,280,350);
				
		LaminaMarcoCliente milamina=new LaminaMarcoCliente();
		
		add(milamina);
		
		setVisible(true);
		
		addWindowListener(new EnvioOnline());
		}	
	
}
///Envio de señal online
class EnvioOnline extends WindowAdapter
{
	public void windowOpened(WindowEvent e)
	{
		try
		{
			Socket so = new Socket("192.168.0.4",999);
			Paquete_envio dato = new Paquete_envio();
			dato.setMensaje("Online");
			ObjectOutputStream paquete_datos = new ObjectOutputStream(so.getOutputStream());
			paquete_datos.writeObject(dato);
			so.close();
		}
		catch(Exception r)
		{
			
		}
	}
}
class LaminaMarcoCliente extends JPanel implements Runnable{
	
	public LaminaMarcoCliente(){
	
		String nick_usuario = JOptionPane.showInputDialog("Nick:");
		JLabel n_nick= new JLabel("Nick:");
		add(n_nick);
		nick= new JLabel();
		nick.setText(nick_usuario);
		add(nick);
		
		JLabel texto=new JLabel("Online:");
		
		add(texto);
		
		ip= new JComboBox();
		/*ip.addItem("Usuario 1");
		ip.addItem("Usuario 2");
		ip.addItem("Usuario 3");*/
		//ip.addItem("192.168.0.26");
		//ip.addItem("192.168.0.19");
		add(ip);
		
		campochat = new JTextArea(12,23);
		campochat.setEditable(false);
		add(campochat);
	
		campo1=new JTextField(20);
	
		add(campo1);		
	
		miboton=new JButton("Enviar");
		
		EnviaTexto e = new EnviaTexto();
		miboton.addActionListener(e);
		add(miboton);	
		
		Thread hilo = new Thread(this);
		hilo.start();
		
	}
	
	
	private class EnviaTexto implements ActionListener
	{

		
		public void actionPerformed(ActionEvent e) {
			//System.out.println(campo1.getText());
			
			campochat.append("\n "+"Tú: "+campo1.getText());
			
			//Creacion de Socket
			try {
				Socket so = new Socket("192.168.0.4",999);
				
				Paquete_envio datos= new Paquete_envio();
				datos.setNick(nick.getText());
				datos.setIp(ip.getSelectedItem().toString());
				datos.setMensaje(campo1.getText());
				
				//Enviar objectos 
				ObjectOutputStream paquete_datos = new ObjectOutputStream(so.getOutputStream());
				
				//Escribir el objecto 
				paquete_datos.writeObject(datos);
				//Cerrando el flujo de datos
				so.close();
				
				//Flujo de datos de salida
				/*DataOutputStream flujo = new DataOutputStream(so.getOutputStream());
				flujo.writeUTF(campo1.getText());
				flujo.close();*/
				campo1.setText(null);
				
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				//e1.printStackTrace();
				System.out.println(e1.getMessage());
			}
			
			
		}
		
	}
		
		
		
	private JTextField campo1;
	private JTextArea campochat;
	private JButton miboton;
	private JLabel nick;
	private JComboBox ip;
	
	
	public void run() {
		
		try
		{
			ServerSocket servidor_cliente = new ServerSocket(9090);
			Socket clientes;
			Paquete_envio paquete_recibido;
			
			while(true)
			{
				clientes=servidor_cliente.accept();
				ObjectInputStream flujo_entrada= new ObjectInputStream(clientes.getInputStream());
				
				paquete_recibido=(Paquete_envio) flujo_entrada.readObject();
				
				if(!paquete_recibido.getMensaje().equals("Online"))
				{
					campochat.append("\n"+paquete_recibido.getNick()+": "+paquete_recibido.getMensaje());
				}
				else
				{
					//campochat.append("\n"+paquete_recibido.getIps());
					ArrayList<String> ips_menu = new ArrayList<String>();
					ips_menu=paquete_recibido.getIps();
					
					ip.removeAllItems();
					for (String z : ips_menu) {
						ip.addItem(z);
					}
					
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
}
class Paquete_envio implements Serializable
{
	private String nick,ip,mensaje;
	private ArrayList<String>ips; 

	public ArrayList<String> getIps() {
		return ips;
	}

	public void setIps(ArrayList<String> ips) {
		this.ips = ips;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}