package hilos;

public class SincronizarHilos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HiloVarios hilos = new HiloVarios();
		HiloVarios2 hilo2 = new HiloVarios2(hilos);
		
		hilo2.start();
		hilos.start();
		
		
	
		System.out.println("Terminadas las tareas");
	}

}
class HiloVarios extends Thread
{
	public void run()
	{
		for(int i=0;i<15;i++)
		{
			System.out.println("Ejecutando hilo "+getName());
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class HiloVarios2 extends Thread
{
	private Thread hilo;
	public HiloVarios2(Thread hilo)
	{
		this.hilo=hilo;
	}
	public void run()
	{
		try {
			hilo.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for(int i=0;i<15;i++)
		{
			System.out.println("Ejecutando hilo "+getName());
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}