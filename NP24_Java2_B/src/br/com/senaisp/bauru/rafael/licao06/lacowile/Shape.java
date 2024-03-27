package br.com.senaisp.bauru.rafael.licao06.lacowile;

public class Shape {
	public void criarRetangulo(int larg, int alt) {
		if (larg <= 0 || alt <= 0) {
			System.out.println("Não temos como fazer a figura!");
		} else {
			// aqui começa o codigo.
			for (int lin = 1; lin <= alt; lin++) {
				for (int col = 1; col <= larg; col++) {
					if (lin == 1 || lin == alt || col == larg || col == 1) {
						System.out.print("#");
					} else {
						System.out.print(" ");
					} // Fim do else
				} // Fim do for coluna(col)
				System.out.println();
			} // fim do for linha(lin)
		} // Fim do Else.
	}// Fim do criarRetangulo

	public void criarTriangulo(int larg, int alt) {
		if (larg <= 0 || alt <= 0) {
			System.out.println("Não temos como fazer a figura!");
		} else {
			for (int lin = 1; lin <= alt; lin++) {
				for (int col = 1; col <= larg; col++) {
					if (col==1 || col == lin || lin == alt) {
						System.out.print("#");
					} else {
						System.out.print(" ");
					} // Fim do else
				} // Fim do for coluna(col)
				System.out.println();
			} // fim do for linha(lin)
		}//Fim do else
	}//Fim do criarTriangulo
}
