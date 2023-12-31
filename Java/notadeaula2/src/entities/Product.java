package entities;

public class Product {
	private Integer codigo;
	private String nome;
	private Integer quantidade;
	
	
	public Product(Integer codigo, String nome, Integer quantidade) {
		this.codigo = codigo;
		this.nome = nome;
		this.quantidade = quantidade;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public void venda(int quantVenda) {
		quantidade -= quantVenda;
	}
}
