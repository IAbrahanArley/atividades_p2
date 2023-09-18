package entities;

public class Carro extends Veiculo{

	private Integer numPortas;
	
	public Carro(String marca, String modelo, Integer anoFabricacao, Integer numPortas) {
		super(marca, modelo, anoFabricacao);
		this.numPortas = numPortas;
	
	}

	public Integer getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(Integer numPortas) {
		this.numPortas = numPortas;
	}
	
	public void imprimirDetalhes() {
		System.out.println("Marca: " + getMarca()
		+ "\nModelo: " + getModelo()
		+ "\nAno de fabricação: " + getAnoFabricacao()
		+ "\nNumero de portas: " + numPortas);
	}

}
