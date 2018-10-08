package br.com.cp9.vetoresMatrizes;

public class Matriz {

	public static void main(String[] args) {
		java.io.PrintStream saida = System.out;

		int[][] it;

		it = new int[2][3];

		it[0][0] = 0;
		it[0][1] = 1;
		it[0][2] = 2;
		it[1][0] = 10;
		it[1][1] = 11;
		it[1][2] = 12;

		saida.print("it[0][0] = " + it[0][0] + "\t");
		saida.print("it[0][1] = " + it[0][1] + "\t");
		saida.print("it[0][2] = " + it[0][2] + "\t");
		saida.print("it[1][0] = " + it[1][0] + "\t");
		saida.print("it[1][1] = " + it[1][1] + "\t");
		saida.print("it[1][2] = " + it[1][2] + "\n");

		saida.println("Posições: " + it.length + "x" + it[0].length);
		saida.println();

		char[][] ch = { { 'A', 'B', 'C' }, { 'a', 'b', 'c' }, { '1', '2', '3' } };

		saida.println("Conteúdo da matriz ch:");
		for (int i = 0; i < ch.length; i++) {

			for (int j = 0; j < ch[i].length; j++) {
				saida.print("ch[" + i + "][" + j + "] = " + ch[i][j] + "\t");
				saida.println();
			}
		}
		saida.println("Posições: " + ch.length + "x" + ch[0].length);

	}

}
