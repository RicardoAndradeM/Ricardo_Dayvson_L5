package hotel;

public class Estadia {
	Animal animal;
	double valorQuarto;
	int qtdDias;

	public Estadia(String nome, String tipo, int idade, int qtdDias, double valorQuarto) throws Exception {
		animal = new Animal(nome, tipo, idade);
		this.valorQuarto = valorQuarto;
		this.qtdDias = qtdDias;
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
		return valorQuarto;
	}

	public int getQtdDias() {
		return qtdDias;
	}

	@Override
	public String toString() {
		return getNome() + ", " + getTipo() + ", " + getQtdDias() + " dia(s) com o preço de R$ "
				+ String.format("%.2f", getValorQuarto());

	}

	
}
