package componentes_swing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import eventos.Util;

public class ComboBox  extends JFrame{

	
	ComboBox()
	{
		setTitle("UPC-Despegables");
		setResizable(false);
		setSize(500,500);
		
		Util.centrarVentana(this);
		
		PanelComboBox pnlCombox = new PanelComboBox();
		add(pnlCombox);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ComboBox ventana = new ComboBox();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
	}

}
class PanelComboBox extends JPanel
{
	
	
	private JLabel texto;
	private JComboBox combo;
	PanelComboBox()
	{
		setLayout(new BorderLayout());
		
		texto = new JLabel("En un lugar de la mancha cuyo nombre .....");
		texto.setFont(new Font("Serif",Font.PLAIN,20));
		add(texto,BorderLayout.CENTER);
		
		JPanel panelNorte = new JPanel();
		
		combo = new JComboBox();
		combo.setEditable(false);
		combo.addItem("Serif");
		combo.addItem("SansSerif");
		combo.addItem("Monospaced");
		combo.addItem("Dialog");
		
		EventoCombo escucha = new EventoCombo();
		combo.addActionListener(escucha);
		
		panelNorte.add(combo);
		add(panelNorte,BorderLayout.NORTH);
	}
	
	private class EventoCombo implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			texto.setFont(new Font((String)combo.getSelectedItem(),Font.PLAIN,20));
		}
		
	}
}
