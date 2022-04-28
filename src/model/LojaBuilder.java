package model;

import java.util.ArrayList;
import java.util.List;

public class LojaBuilder {

	private Loja loja;
	private List<Calcado> calcados = new ArrayList<>();
	private List<Camisetas> camisetas = new ArrayList<>();
	private List<Equipamento> equipamentos = new ArrayList<>();
	private List<JogosEletronicos> jogosEletronicos = new ArrayList<>();

	public LojaBuilder() {
		this.loja = new Loja();
	}

	public static LojaBuilder builder() {
		return new LojaBuilder();
	}

	public LojaBuilder addCalcado(Integer tamanho, String cor, TipoCalcado tipo, Double valor) {
		Calcado cal = new Calcado();
		cal.setTamanho(tamanho);
		cal.setCor(cor);
		cal.setTipo(tipo);
		cal.setValor(valor);
		this.calcados.add(cal);

		return this;
	}

	public LojaBuilder addCamiseta(TamanhoCamiseta tamanho, String cor, String marca, Double valor) {
		Camisetas cam = new Camisetas();
		cam.setTamanho(tamanho);
		cam.setCor(cor);
		cam.setMarca(marca);
		cam.setValor(valor);
		this.camisetas.add(cam);

		return this;
	}

	public LojaBuilder addEquipamento(TipoArmazenamento armazenamento, Integer capacidade, String fabricante,
			Double valor) {
		Equipamento equi = new Equipamento();
		equi.setArmazenamento(armazenamento);
		equi.setCapacidade(capacidade);
		equi.setFabricante(fabricante);
		equi.setValor(valor);
		this.equipamentos.add(equi);

		return this;
	}
	
	public LojaBuilder addJogoEletronico(String nome, TipoVideogame videogame, Double valor) {
		JogosEletronicos jogo = new JogosEletronicos();
		jogo.setNome(nome);
		jogo.setVideogame(videogame);
		jogo.setValor(valor);
		this.jogosEletronicos.add(jogo);
		
		return this;
	}
	
	public Loja get() {
		this.loja.setCalcados(this.calcados);
		this.loja.setCamisetas(this.camisetas);
		this.loja.setEquipamentos(this.equipamentos);
		this.loja.setJogosEletronicos(this.jogosEletronicos);
		
		return this.loja;
	}
}