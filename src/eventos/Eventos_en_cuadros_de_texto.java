package eventos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class Eventos_en_cuadros_de_texto extends JFrame{

	public Eventos_en_cuadros_de_texto()
	{
		setTitle("UPC-Eventos_textos");
		setSize(500,500);
		setResizable(false);
		Util.centrarVentana(this);
		
		 PanelTexto1 campo = new  PanelTexto1();
		 add(campo);
		
	}
	public static void main(String[] args) {
		
		Eventos_en_cuadros_de_texto ventana = new Eventos_en_cuadros_de_texto();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);

	}

}
class PanelTexto1 extends JPanel{
	
	public PanelTexto1()
	{
		JTextField campo = new JTextField(20);
		EscuchaTexto el_evento = new EscuchaTexto();
		Document midoc = campo.getDocument();
		midoc.addDocumentListener(el_evento);
		add(campo);
	}
	
	private class EscuchaTexto implements DocumentListener{

	
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			System.out.println("dad");
			
		}

		
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Has insertado texto");
			
		}

		
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Has borrado texto");
		}
		
	}
}
