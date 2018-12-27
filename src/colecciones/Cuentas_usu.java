package colecciones;

import java.util.*;

public class Cuentas_usu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cl1 = new Cliente("Antonio","00001",200000);
		Cliente cl2 = new Cliente("Maria","00002",250000);
		Cliente cl3 = new Cliente("Penelope","00003",300000);
		Cliente cl4 = new Cliente("Sebastian","00004",500000);
		
		Set <Cliente> clientes = new HashSet<Cliente>();
		clientes.add(cl1);
		clientes.add(cl2);
		clientes.add(cl3);
		clientes.add(cl4);
		
		/*for (Cliente cliente : clientes) 
		{
			//System.out.println(cliente.getNom()+" "+cliente.getNumcun()+" "+cliente.getSaldos());
			
			if(cliente.getNom().equals("Penelope"))
			{
				clientes.remove(cl3);
			}
		}
		*/
		
		Iterator <Cliente> it= clientes.iterator(); 
		while(it.hasNext())
		{
			String nom_clie=it.next().getNom();
			if(nom_clie.equals("Penelope"))
			{
				it.remove();
			}
		}
		
		for (Cliente cliente : clientes) 
		{
			System.out.println(cliente.getNom()+" "+cliente.getNumcun()+" "+cliente.getSaldos());
			
		}
		
		/*
		Iterator <Cliente> it= clientes.iterator(); 
		
		while(it.hasNext())
		{
			String nom_clien=it.next().getNom();
			System.out.println(nom_clien);
			String ncuen=it.next().getNumcun();
			System.out.println(ncuen);
			
		}
		*/
		
		
	}

}
