package br.com.cap9.vetoresMatrizes;

public class Vetor {

	public static void main(String[] args) {

		java.io.PrintStream saida = System.out;

		int[] it;
		it = new int[3];
		it[0] = 65;
		it[1] = 66;
		it[2] = 67;
		
		saida.println("COnteúdo do vetori:");
		saida.print("it[0] = "+ it[0]+"\t");
		saida.print("it[1] = "+ it[1]+"\t");
		saida.print("it[2] = "+ it[2]+"\t");
		saida.print("Qtde de posições: "+it.length+"\n\n");
		
		
		double[] db = new double[2];
		db[0]= 1.25;
		db[1]= 2.54;

		saida.println("Conteúdo do valor db:");
		saida.print("db[0] = " +db[0] + "\t");
		saida.print("db[1] = " +db[1] + "\t");
		saida.print("Qtde de posições: "+db.length+"\n\n");

		
		
		char[] ch = {'x','y','z'};
		
		saida.println("Conteúdo  do vetor ch :");
		for (int i =0; i < ch.length ; i++) {
			saida.println("ch[" +i+"]" + ch[i]+ "\t");
		}
		
		saida.print("Qtde de posições: "+ch.length+"\n\n");		
        saida.println();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
