package Model;

public class Factory {

	public Factory() {
		// TODO Auto-generated constructor stub
	}
	
	public Cliente createCliJuridico() {
		return new ClienteJuridico();
	}
	
	public Cliente createCliFisico() {
		return new ClienteFisico();
	}

}
