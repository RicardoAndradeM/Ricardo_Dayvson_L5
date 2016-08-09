package hotel;

import java.util.ArrayList;

public class Recepcao {
	
	private ArrayList<Estadia> estadias;
	
	public Recepcao() {
		this.estadias = new ArrayList<Estadia>();
	}
	
	public void checkIn(String nome, String tipo, int idade, int dias, double valor) throws Exception {
		Estadia estadia = new Estadia(nome, tipo, idade, dias, valor);
		estadias.add(estadia);

	}
	
	public void checkOut(String nome){
		for (Estadia estadia : estadias) {
			if(estadia.getNome().equals(nome)){
				estadias.remove(estadia);
				break;
			}
		}
	}
	
	public int getNumDeHospedes() {
		return estadias.size();
	}
	
	public double getLucroTotal() {
		double lucro = 0.0;
		for (Estadia estadia : estadias) {
			lucro += estadia.getValorQuarto();
		}
		return lucro;
	}
	
	@Override
	public String toString() {
		String saida = "Estadias:";
		for (Estadia estadia : estadias) {
			saida+= String.format("\n%s", estadia.toString());
		}
		return saida;
	}
}
