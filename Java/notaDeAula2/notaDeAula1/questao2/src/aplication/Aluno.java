package aplication;

public class Aluno {
	private String name;
	private Integer nota1;
	private Integer nota2;
	private Integer nota3;
	
	public Aluno(String name, Integer nota1, Integer nota2, Integer nota3) {
		this.name = name;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNota1() {
		return nota1;
	}

	public void setNota1(Integer nota1) {
		this.nota1 = nota1;
	}

	public Integer getNota2() {
		return nota2;
	}

	public void setNota2(Integer nota2) {
		this.nota2 = nota2;
	}

	public Integer getNota3() {
		return nota3;
	}

	public void setNota3(Integer nota3) {
		this.nota3 = nota3;
	}
	
	public String calcularMedia() {
		double media = (nota1 + nota2 + nota3) / 3;
		if (media >= 70) {
			return "Aprovado!!";
		} else {
			return "Reporvado";

		}
	}
	
	
}
