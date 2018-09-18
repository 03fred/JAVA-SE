package br.com.cap5.introducaoApiJava;

public class InvolucroNumeros extends AnalisadorDeTexto {

	public static void main(String[] args) {

		byte bt1 = Byte.parseByte("127");
		short sh = Short.parseShort("32767");
		int it = Integer.parseInt("12345678");
		float fl = Float.parseFloat("3.1234");
		double db = Double.parseDouble("0.121313");

		saida.println();
		saida.println("Conteudo das variaveis");
		saida.println("bt1 " + bt1);
		saida.println("sh " + sh);
		saida.println("it " + it);
		saida.println("fl " + fl);
		saida.println("db " + db);
		saida.println();
		Byte bt2 = Byte.valueOf("127");
		Short sh2 = Short.valueOf("32767");
		Integer it2 = Integer.valueOf("123456");
		Float fl2 = Float.valueOf("3.1234");
		Double db2 = Double.valueOf("0.121313");

		saida.println("Conteudo dos objetos");
		saida.println("bt2 " + bt2.toString());
		saida.println("sh2 " + sh2.toString());
		saida.println("it2 " + it2.toString());
		saida.println("fl2 " + fl2.toString());
		saida.println("db2 " + db2.toString());
	}

}
