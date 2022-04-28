package model;

public class Camisetas {
	private TamanhoCamiseta tamanho;
	private String cor;
	private String marca;
	private Double valor;
	
	public TamanhoCamiseta getTamanho() {
		return tamanho;
	}
	public void setTamanho(TamanhoCamiseta tamanho) {
		this.tamanho = tamanho;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Camisetas [tamanho=" + tamanho + ", cor=" + cor + ", marca=" + marca + ", valor=" + valor + "]";
	}
	
	
}
