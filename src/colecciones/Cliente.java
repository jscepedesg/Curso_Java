package colecciones;

public class Cliente {
	
	private String nom;
	private String numcun;
	private double saldos;
	
	public Cliente(String nom,String numcun,double saldos)
	{
		this.nom=nom;
		this.numcun=numcun;
		this.saldos=saldos;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNumcun() {
		return numcun;
	}

	public void setNumcun(String numcun) {
		this.numcun = numcun;
	}

	public double getSaldos() {
		return saldos;
	}

	public void setSaldos(double saldos) {
		this.saldos = saldos;
	}

	//Modifica el hashcode y equals para hacerlos comparables
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}
	
	

}
