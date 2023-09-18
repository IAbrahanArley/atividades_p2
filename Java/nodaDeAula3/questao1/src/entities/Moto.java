package entities;

public class Moto extends Veiculo {
	
	private Integer cilindradas;

	public Moto(String marca, String modelo, Integer anoFabricacao, Integer cilindradas) {
		super(marca, modelo, anoFabricacao);
		this.cilindradas = cilindradas;
	}

	public Integer getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(Integer cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	public void imprimirDetalhes() {
		System.out.println("Marca: " + getMarca()
				+ "\nModelo: " + getModelo()
				+ "\nAno de fabricação: " + getAnoFabricacao()
				+ "\nCilindradas: " + cilindradas);
	}

	
	
}
