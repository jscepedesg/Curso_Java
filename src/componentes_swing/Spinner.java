package componentes_swing;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

import graficos_swing.Util;

public class Spinner extends JFrame {

	
	Spinner()
	{
		setSize(500,500);
		setResizable(false);
		setTitle("UPC-Spinner");
		
		Util.centrarVentana(this);
		
		PanelSpinner pnlSpinner = new PanelSpinner();
		
		add(pnlSpinner);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Spinner ventana = new Spinner();
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class PanelSpinner extends JPanel
{
	
	PanelSpinner()
	{
		String lista[] = new String[12];
		lista[0]="Enero";
		lista[1]="Febrero";
		lista[2]="Marzo";
		lista[3]="Abril";
		lista[4]="Mayo";
		lista[5]="Junio";
		lista[6]="Julio";
		lista[7]="Agosto";
		lista[8]="Septiembre";
		lista[9]="Octubre";
		lista[10]="Nomviembre";
		lista[11]="Diciembre";
		//JSpinner control = new JSpinner(new SpinnerDateModel());//Clase de fecha
		//JSpinner control = new JSpinner(new SpinnerListModel(lista));//Poner una lista en el spinner
		JSpinner control = new JSpinner(new SpinnerNumberModel(10,0,10,1));//Pone el spinner con datos numeriocos
		//JSpinner control = new JSpinner(new MimodeloSpinner());
		control.setEditor(new JSpinner.DefaultEditor(control));
		Dimension d= new Dimension(70,35);
		control.setPreferredSize(d);
		control.setFont(new Font("Bodoni MT Poster Compressed",Font.PLAIN,30));
		add(control);
	}
	/*private class MimodeloSpinner extends SpinnerNumberModel
	{
		public MimodeloSpinner()
		{
			super(5,0,10,1);
		}
		public Object getNextValue()
		{
			return super.getPreviousValue();
		}
		
		public Object getPreviousValue()
		{
			return super.getNextValue();
		}
	}*/
}
