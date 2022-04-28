package model;

public class Calcado {
	
	private Integer tamanho;
	private String cor;
	private TipoCalcado tipo;
	private Double valor;
	public Integer getTamanho() {
		return tamanho;
	}
	public void setTamanho(Integer tamanho) {
		this.tamanho = tamanho;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public TipoCalcado getTipo() {
		return tipo;
	}
	public void setTipo(TipoCalcado tipo) {
		this.tipo = tipo;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Calcados [tamanho=" + tamanho + ", cor=" + cor + ", tipo=" + tipo + ", valor=" + valor + "]";
	}
	
	
}
