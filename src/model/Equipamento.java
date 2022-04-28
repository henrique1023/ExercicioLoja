package model;

public class Equipamento {
	private TipoArmazenamento armazenamento;
	private Integer capacidade;
	private String fabricante;
	private Double valor;
	
	public TipoArmazenamento getArmazenamento() {
		return armazenamento;
	}
	public void setArmazenamento(TipoArmazenamento armazenamento) {
		this.armazenamento = armazenamento;
	}
	public Integer getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Equipamento [armazenamento=" + armazenamento + ", capacidade=" + capacidade + ", fabricante="
				+ fabricante + ", valor=" + valor + "]";
	}
	
	
}
