package hotel;

public class Hotel {
	private Recepcao recepcao;
	
	public Hotel() {
		this.recepcao = new Recepcao();
	}
	
	public void checkin(String nome, string tipo, int idade, int dias, double valor) {
		this.recepcao.checkin(nome, tipo, idade, dias, valor);
	}
	
	public void checkout(String nome) {
		this.recepcao.checkout(nome);
	}
	
	public int getNumDeHospedes() {
		return this.recepcao.getNumDeHospedes();
	}
	
	public double getLucroTotal() {
		return this.recepcao.getLucroTotal();
	}
	
	@Override
	public String toString() {
		return this.recepcao.toString();
	}
}
