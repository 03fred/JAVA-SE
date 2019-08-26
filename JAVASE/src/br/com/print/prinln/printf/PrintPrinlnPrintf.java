package br.com.print.prinln.printf;

public class PrintPrinlnPrintf {

	public static void main(String[] args) {

		/* // CLASSE SYSTEM
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
*/
		
		String str[] = {"fulano","beautrano","ci"};
		String aux = "";
	    int i = 0;
	    for(i = 0; i<3; i++){
	        for(int j = 0; j<2; j++){
	            if(str[j].length() > str[j + 1].length()){
	                aux = str[j];
	                str[j] = str[j+1];
	                str[j+1] = aux;
	            }
	        }
	    }
	    for(i = 0; i<3; i++){
	        System.out.println(" "+str[i]);
	    }
		
		
	}

}
