package br.com.print.prinln.printf;

public class PrintPrinlnPrintf {

	public static void main(String[] args) {

		// CLASSE SYSTEM
		// ATRIBUTO OUT
		// M�TODO PRINT

		System.out.print('A');
		System.out.print("\n");
		System.out.print("Um n�mero Inteiro:\t");
		System.out.print(123);
		System.out.print("\n");

		// M�TODO PRINTLN
		System.out.println("Um n�mero decimal:\t" + 4.3);
		System.out.println("Um valor booleano:\t" + true);
		System.out.println("Uma barra invertida:\t\\");
		System.out.println("Um texto entre aspas:\t" + "\"Rui\"");
		System.out.println();

		// SAIDAS FORMATADAS
		// M�TODO PRINTF
		System.out.printf("%s � um %s", "Plat�o", "Fil�sofo");

		System.out.printf("Um caractere: %c", 'A');
		System.out.println();
		System.out.printf("Um texto: %s", "Java em todos os lugares");
		System.out.println();

	}

}
