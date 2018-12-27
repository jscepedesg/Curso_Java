package componentes_swing;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import eventos.Util;

public class MarcosSlider extends JFrame{

	
	MarcosSlider()
	{
		setTitle("UPC-Controles");
		setResizable(false);
		setSize(500,500);
		Util.centrarVentana(this);
		
		PanelSlider pnlSlider = new PanelSlider();
		add(pnlSlider);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcosSlider ventana = new MarcosSlider();
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class PanelSlider extends JPanel
{
	
	private JLabel rotulo;
	private JSlider control;
	PanelSlider()
	{
		setLayout(new BorderLayout());
		
		rotulo = new JLabel("En algun lugar de la mancha cuyo nombre ........");
		add(rotulo,BorderLayout.CENTER);
		
		
		control = new JSlider(8,50,12);
		control.setMajorTickSpacing(14);
		control.setMinorTickSpacing(1);
		control.setPaintTicks(true);
		control.setPaintLabels(true);
		control.setFont(new Font("Serif",Font.ITALIC,12));
		
		JPanel panelSlider = new JPanel();
		panelSlider.add(control);
		add(panelSlider,BorderLayout.NORTH);
		
		EventoSlider escucha = new EventoSlider();
		control.addChangeListener(escucha);
		
	   // control = new JSlider(SwingConstants.VERTICAL,0,100,25);//Construrtor con posicion
		//add(control);
		
		//control.setMajorTickSpacing(20);//De 20 en 20 hasta 100
		//control.setMinorTickSpacing(5);//Lineas de a 5
		//control.setPaintTicks(true);//Pinta las lineas
		//control.setPaintLabels(true);//Pinta marcas
		//control.setSnapToTicks(true);//Avanza hasta el proximo rotulo
	}
	
	private class EventoSlider implements ChangeListener
	{

		@Override
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
			
			//System.out.println("Estas manipulando el deslizante :"+control.getValue());
			rotulo.setFont(new Font("Serif",Font.PLAIN,control.getValue()));
		}
		
	}
}
