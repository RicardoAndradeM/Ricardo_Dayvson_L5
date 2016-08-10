package hotel;

import java.util.Locale;

public class Estadia {
	Animal animal;
	double valor;
	int dias;

	public Estadia(String nome, String tipo, int idade, int dias, double valor) throws Exception {
		animal = new Animal(nome, tipo, idade);
		this.valor = valor;
		this.dias = dias;
	}

	public String getNome() {
		return animal.getNome();
	}

	public String getTipo() {
		return animal.getTipo();

	}

	public int getIdade() {
		return animal.getIdade();
	}

	public double getValorQuarto() {
		return valor;
	}

	public int getQtdDias() {
		return dias;
	}

	@Override
	public String toString() {
		return getNome() + " (" + getTipo() + "): " + getQtdDias() + " dias com o preco de R$ "
				+ String.format(Locale.US,"%.2f", getValorQuarto());

	}

	
}
