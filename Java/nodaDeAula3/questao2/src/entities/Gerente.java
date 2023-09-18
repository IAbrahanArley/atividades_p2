package entities;

public class Gerente extends Funcionario {

	private String departamento;
	
	public Gerente(String nome, Double salario, String departamento) {
		super(nome, salario);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public Double calcularBonus(double salario) {
		return salario * 0.10;
	}
	
	public void imprimirDetalhes() {
		System.out.println("Nome:" + getNome()
							+ "Salario:" + getSalario()
							+ "Departamento: " + departamento);
	}

	
	

}
