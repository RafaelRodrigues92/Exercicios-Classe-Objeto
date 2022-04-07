package atividade02;

public class TesteAviao {

	public static void main(String[] args) {
		
		Aviao passageiro = new Aviao();
		
		passageiro.nome = "Rafael Dias Rodrigues";
		passageiro.destino = "Barcelona";
		passageiro.data = "15/05/2022 as 18:00 horas";
		passageiro.assento = "89b";
		
		passageiro.dadosPasseiro();
	}

}
