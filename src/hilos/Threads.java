package hilos;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Threads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame marco=new MarcoRebote();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco.setVisible(true);
	}

}
//Movimiento de la pelota-----------------------------------------------------------------------------------------

class Pelota{
	
	// Mueve la pelota invirtiendo posición si choca con límites
	
	public void mueve_pelota(Rectangle2D limites){
		
		x+=dx;
		
		y+=dy;
		
		if(x<limites.getMinX()){
			
			x=limites.getMinX();
			
			dx=-dx;
		}
		
		if(x + TAMX>=limites.getMaxX()){
			
			x=limites.getMaxX() - TAMX;
			
			dx=-dx;
		}
		
		if(y<limites.getMinY()){
			
			y=limites.getMinY();
			
			dy=-dy;
		}
		
		if(y + TAMY>=limites.getMaxY()){
			
			y=limites.getMaxY()-TAMY;
			
			dy=-dy;
			
		}
		
	}
	
	//Forma de la pelota en su posición inicial
	
	public Ellipse2D getShape(){
		
		return new Ellipse2D.Double(x,y,TAMX,TAMY);
		
	}	
	
	private static final int TAMX=15;
	
	private static final int TAMY=15;
	
	private double x=0;
	
	private double y=0;
	
	private double dx=1;
	
	private double dy=1;
	
	
}

//Lámina que dibuja las pelotas----------------------------------------------------------------------


class LaminaPelota extends JPanel{
	
	//Añadimos pelota a la lámina
	
	public void add(Pelota b){
		
		pelotas.add(b);
	}
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D)g;
		
		for(Pelota b: pelotas){
			
			g2.fill(b.getShape());
		}
		
	}
	
	private ArrayList<Pelota> pelotas=new ArrayList<Pelota>();
}


//Marco con lámina y botones------------------------------------------------------------------------------

class MarcoRebote extends JFrame{
	
	public MarcoRebote(){
		
		setBounds(600,300,600,350);
		
		setTitle ("Rebotes");
		
		lamina=new LaminaPelota();
		
		add(lamina, BorderLayout.CENTER);
		
		JPanel laminaBotones=new JPanel();
		
		arran1 = new JButton("Hilo 1");
		arran1.addActionListener(new ActionListener()
				{

					public void actionPerformed(ActionEvent e) {
					
						comienza_el_juego(e);
					}
					
				});
		laminaBotones.add(arran1);
		
		//-----------------------------------
		
		arran2 = new JButton("Hilo 2");
		arran2.addActionListener(new ActionListener()
				{

					public void actionPerformed(ActionEvent e) {
					
						comienza_el_juego(e);
					}
					
				});
		laminaBotones.add(arran2);
		
		//-----------------------------------
		
				arran3 = new JButton("Hilo 3");
				arran3.addActionListener(new ActionListener()
						{

							public void actionPerformed(ActionEvent e) {
							
								comienza_el_juego(e);
							}
							
						});
				laminaBotones.add(arran3);
				

				//-----------------------------------
				
				det1 = new JButton("detener 1");
				det1.addActionListener(new ActionListener()
								{

									public void actionPerformed(ActionEvent e) {
									
										detener(e);
									}
									
								});
						laminaBotones.add(det1);
						//-----------------------------------
						
						det2 = new JButton("detener 2");
						det2.addActionListener(new ActionListener()
										{

											public void actionPerformed(ActionEvent e) {
											
												detener(e);
											}
											
										});
								laminaBotones.add(det2);
								
								//-----------------------------------
								
							det3 = new JButton("detener 3");
							det3.addActionListener(new ActionListener()
							{
								
								public void actionPerformed(ActionEvent e) {
									detener(e);
									
								}
													
							});
							laminaBotones.add(det3);
		
		add(laminaBotones, BorderLayout.SOUTH);
	}
	
	
	//Ponemos botones
	
	public void ponerBoton(Container c, String titulo, ActionListener oyente){
		
		JButton boton=new JButton(titulo);
		
		c.add(boton);
		
		boton.addActionListener(oyente);
		
	}
	
	//Añade pelota y la bota 1000 veces
	
	public void comienza_el_juego (ActionEvent e){
		
					
			Pelota pelota=new Pelota();
			
			lamina.add(pelota);
			
			
			 r = new PelotaHilos(pelota,lamina);
			
			 if(e.getSource().equals(arran1))
			 {
				 l1 = new Thread(r);
				 l1.start();
			 }
			 else if(e.getSource().equals(arran2))
			 {
				 l2 = new Thread(r);
				 l2.start();
			 }
			 else if(e.getSource().equals(arran3))
			 {
				 l3 = new Thread(r);
				 l3.start();
			 }
			
		
		
	}
	
	public void detener(ActionEvent e)
	{
		//l.stop();
		if(e.getSource().equals(det1))
		{
			l1.interrupt();
		}
		else if(e.getSource().equals(det2))
		{
			l2.interrupt();
		}
		else if(e.getSource().equals(det3))
		{
			l3.interrupt();
		}
		
		
	}
	
	private LaminaPelota lamina;
	private Runnable r;
	private Thread l1,l2,l3;
	private JButton arran1,arran2,arran3,det1,det2,det3;
	
}


class PelotaHilos implements Runnable
{
	private Pelota pelota;
	private Component componente;
	
	public PelotaHilos(Pelota unapelota, Component uncomoponet)
	{
		pelota=unapelota;
		componente=uncomoponet;
		
	}
	
	public void run() {
		
	//	for (int i=1; i<=3000; i++)
		while(!Thread.interrupted())
		{
			pelota.mueve_pelota(componente.getBounds());
			
			componente.paint(componente.getGraphics());
			try {
				Thread.sleep(4);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				Thread.currentThread().interrupt();
			}
		}
	}
}