package entities;

public class Diretor extends Funcionario {
	
	private Integer acoes;
	
	public Diretor(String nome, Double salario, Integer acoes) {
		super(nome, salario);
		this.acoes = acoes;
	}

	public Integer getAcoes() {
		return acoes;
	}

	public void setAcoes(Integer acoes) {
		this.acoes = acoes;
	}
	

	public void imprimirDetalhes() {
		System.out.println("Nome:" + getNome()
							+ "Salario:" + getSalario()
							+ "Quantidade de açoes:"  + acoes);
	}
	
	
	
}
