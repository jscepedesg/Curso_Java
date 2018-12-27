package poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;


public class Dame_la_hora implements ActionListener {

	
	public void actionPerformed(ActionEvent arg0) {
		
		Date ahora = new Date();
		
		System.out.println("Te pongo la hora cada 5 seg"+ahora);
		Toolkit.getDefaultToolkit().beep();
		
	}

}
