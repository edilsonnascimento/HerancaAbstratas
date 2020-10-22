// Criado por Edilson do Nascimento

package br.edu.utfpr.pos;

public class Teste {

	public static void main(String[] args) {

		//CRIA OBJETOS
		Passeio passeio1 = new Passeio(6, 110);
		passeio1.setPlaca("AXU456");
		passeio1.setMarca("Chevrolet");
		passeio1.setModelo("ZT");
		passeio1.setVelocidadeMaxima(250);
		passeio1.setQuantidadePassageiros(45);
		Passeio passeio2 = new Passeio("TOI056", "Chevrolet", "GH", 198, 4, 110, 36);

		Carga carga1 = new Carga(8, 300);
		carga1.setPlaca("VBG768");
		carga1.setMarca("Volkswagen");
		carga1.setModelo("PL");
		carga1.setVelocidadeMaxima(330.777);
		carga1.setCargaMaxima(15000);
		Carga carga2 = new Carga("UGX765", "Chevrolet", "ZT", 350, 8, 900, 85, 6);

		// MOSTRA DADOS
		System.out.println(passeio1);
		System.out.println(passeio2);
		System.out.println(carga1);
		System.out.println(carga2);

	}

}
