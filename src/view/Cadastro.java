package view;

import model.Loja;
import model.LojaBuilder;
import model.TamanhoCamiseta;
import model.TipoArmazenamento;
import model.TipoCalcado;
import model.TipoVideogame;

public class Cadastro {
	public static void main(String[] args) {
		Loja loja = LojaBuilder.builder()
				.addCalcado(38, "Laranja", TipoCalcado.TENIS, 200.00)
				.addCalcado(40, "Preto", TipoCalcado.SOCIAL, 100.00)
				.addCalcado(39, "Branco", TipoCalcado.SOCIAL, 170.00)
				.addCamiseta(TamanhoCamiseta.GG, "Branco", "Nike", 60.00)
				.addCamiseta(TamanhoCamiseta.GG, "Preto", "Adidas", 60.00)
				.addCamiseta(TamanhoCamiseta.GG, "Laranja", "Adidas", 60.00)
				.addEquipamento(TipoArmazenamento.HDD, 250, "Samsung", 300.00)
				.addEquipamento(TipoArmazenamento.HDD, 250, "Samsung", 300.00)
				.addEquipamento(TipoArmazenamento.HDD, 250, "Samsung", 300.00)
				.addJogoEletronico("Mario", TipoVideogame.SWITCH, 190.00)
				.addJogoEletronico("Mario", TipoVideogame.SWITCH, 190.00)
				.addJogoEletronico("Mario", TipoVideogame.SWITCH, 190.00)
				.get();
				
		System.out.println(loja);
		
	}
}
