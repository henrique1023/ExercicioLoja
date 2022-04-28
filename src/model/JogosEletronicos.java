package model;

public class JogosEletronicos {
	private String nome;
	private TipoVideogame videogame;
	private Double valor;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public TipoVideogame getVideogame() {
		return videogame;
	}
	public void setVideogame(TipoVideogame videogame) {
		this.videogame = videogame;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "JogosEletronicos [nome=" + nome + ", videogame=" + videogame + ", valor=" + valor + "]";
	}
	
	
}
