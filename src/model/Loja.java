package model;

import java.util.ArrayList;
import java.util.List;

public class Loja {
	private List<Calcado> calcados = new ArrayList<>();
	private List<Camisetas> camisetas = new ArrayList<>();
	private List<Equipamento> equipamentos = new ArrayList<>();
	private List<JogosEletronicos> jogosEletronicos = new ArrayList<>();
	
	public List<Calcado> getCalcados() {
		return calcados;
	}
	public void setCalcados(List<Calcado> calcados) {
		this.calcados = calcados;
	}
	public List<Camisetas> getCamisetas() {
		return camisetas;
	}
	public void setCamisetas(List<Camisetas> camisetas) {
		this.camisetas = camisetas;
	}
	public List<Equipamento> getEquipamentos() {
		return equipamentos;
	}
	public void setEquipamentos(List<Equipamento> equipamentos) {
		this.equipamentos = equipamentos;
	}
	public List<JogosEletronicos> getJogosEletronicos() {
		return jogosEletronicos;
	}
	public void setJogosEletronicos(List<JogosEletronicos> jogosEletronicos) {
		this.jogosEletronicos = jogosEletronicos;
	}
	@Override
	public String toString() {
		return "Loja [calcados=" + calcados + ", camisetas=" + camisetas + ", equipamentos=" + equipamentos
				+ ", jogosEletronicos=" + jogosEletronicos + "]";
	}
	
	
}
