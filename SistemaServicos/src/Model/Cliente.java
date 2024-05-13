package Model;

abstract class Cliente {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract void calcular();
	public abstract void m1();
	public abstract void m2();
	public abstract void m3();
	public abstract void m4();
	public abstract void m5();
	public abstract void m6();
}
