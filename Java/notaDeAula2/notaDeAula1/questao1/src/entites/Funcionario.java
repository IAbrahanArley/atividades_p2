package entites;

public class Funcionario {
	private Integer matricula;
	private String nome;
	private Double salario;
	
	public Funcionario(Integer matricula, String nome, Double salario) {
		this.matricula = matricula;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public Double descontarInss() {
		return salario * 0.15;
	}

	@Override
	public String toString() {
		return "Funcionario [matricula=" + matricula + ", nome=" + nome + ", salario=" + salario + ", descontarInss()="
				+ descontarInss() + "]";
	}
	
	
}
