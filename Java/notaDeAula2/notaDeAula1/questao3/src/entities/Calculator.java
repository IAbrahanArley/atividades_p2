package entities;

public class Calculator {
	
	private Double num1;
	private Double num2;
	
	public Calculator(Double num1, Double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public Double getNum1() {
		return num1;
	}
	public void setNum1(Double num1) {
		this.num1 = num1;
	}
	public Double getNum2() {
		return num2;
	}
	public void setNum2(Double num2) {
		this.num2 = num2;
	}
	
	public Double somar() {
		double total = num1 + num2;
		return total;
	}
	
	public Double subtrair() {
		double total = num1 - num2;
		return total;
	}
	
	public Double multiplicar() {
		double total = num1 * num2;
		return total;
		
	}
	
	public Double dividir() {
		double total = num1 / num2;
		return total;
	}
	
}
