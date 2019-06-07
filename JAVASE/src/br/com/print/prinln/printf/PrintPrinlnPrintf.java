package br.com.print.prinln.printf;

public class PrintPrinlnPrintf {

	public static void main(String[] args) {

		// CLASSE SYSTEM
		// ATRIBUTO OUT
		// MÉTODO PRINT

		System.out.print('A');
		System.out.print("\n");
		System.out.print("Um número Inteiro:\t");
		System.out.print(123);
		System.out.print("\n");

		// MÉTODO PRINTLN
		System.out.println("Um número decimal:\t" + 4.3);
		System.out.println("Um valor booleano:\t" + true);
		System.out.println("Uma barra invertida:\t\\");
		System.out.println("Um texto entre aspas:\t" + "\"Rui\"");
		System.out.println();

		// SAIDAS FORMATADAS
		// MÉTODO PRINTF
		System.out.printf("%s é um %s", "Platão", "Filósofo");

		System.out.printf("Um caractere: %c", 'A');
		System.out.println();
		System.out.printf("Um texto: %s", "Java em todos os lugares");
		System.out.println();

	}

}
