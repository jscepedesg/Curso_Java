package hilos;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Banco_Sin_sincronizar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banco b = new Banco();
		
		for(int i =0;i<100;i++)
		{
			Ejecucion_tran r = new Ejecucion_tran(b,i,2000);
			Thread t = new Thread(r);
			t.start();
		}
	}

}
class Banco
{
	private final double cuentas[];
	private Lock cierre_banco= new ReentrantLock();
	private Condition saldosuficiente;
	
	public Banco()
	{
		cuentas = new double[100];
		
		for (int i = 0; i < cuentas.length; i++) {
			cuentas[i]=2000;
		}
		saldosuficiente=cierre_banco.newCondition();
	}
	
	public void setTranferecia(int ori,int des,double cant) throws InterruptedException
	{
		cierre_banco.lock();
		try{
			while(cuentas[ori]<cant)//Evalua que el saldo no es inferior a la cantidad
			{
				//return;
				//Mientras se cumpla la condicion el hilo seguira a la espera
				saldosuficiente.await();
			}
		
			System.out.println(Thread.currentThread());
			cuentas[ori]-=cant;//Dinero que sale de la cuenta origen
			System.out.printf("%10.2f de %d para %d ",cant,ori,des);
			cuentas[des]+=cant;
			System.out.printf("Saldo total: %10.2f%n",getSaldoTotal());
			
			saldosuficiente.signalAll();
		}finally
		{
			cierre_banco.unlock();
		}
		
	}
	
	
	public double getSaldoTotal()
	{
		double sumacuen=0;
		for (double d : cuentas) {
			sumacuen+=d;
		}
		return sumacuen;
	}
}

class Ejecucion_tran implements Runnable
{

	private Banco banco;
	private int delacuen;
	private double canMax;
	public Ejecucion_tran(Banco b,int ori,double max)
	{
		banco=b;
		delacuen=ori;
		canMax=max;
	}
	
	public void run() {
		
		try 
		{
			while(true)
			{
				int paralacuenta=(int)(100*Math.random());
				double cantidad = canMax*Math.random();
			
				banco.setTranferecia(delacuen, paralacuenta, cantidad);
			
			
				Thread.sleep((int)(Math.random()*10));
			
			}
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}