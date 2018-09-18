package br.com.cap5.introducaoApiJava;

public class Involucro extends AnalisadorDeTexto {

	public static void main(String[] args) {

		Boolean b11 = new Boolean(true);
		Boolean b12 = new Boolean("false");

		Character ch = new Character('A');
		Byte bt = new Byte((byte) 127);
		Byte bt2 = new Byte("-128");
		Short sh = new Short((short) 12131);
		Short sh2 = new Short("-1213");
		Integer it = new Integer(1212);
		Integer it2 = new Integer("-1212");
		Long lg = new Long(121231);
		Long lg2 = new Long("-121231");
		Float fl = new Float(3.121312);
		Float f2 = new Float("-3.121312");
		Double db = new Double(1.7128129);
		Double db2 = new Double("-1232132");
		
		saida.println("b11\t" +  b11.booleanValue());
		saida.println("b12\t" +  b12.booleanValue());
		saida.println("ch\t" +   ch.charValue());
		saida.println("bt\t" +  bt.byteValue());
		saida.println("bt2\t" +  bt2.byteValue());
		saida.println("sh\t" +  sh.shortValue());
		saida.println("sh2\t" +  sh2.shortValue());
		saida.println("it\t" +  it.intValue());
		saida.println("it2\t" +  it2.intValue());
		saida.println("lg\t" +  lg.longValue());
		saida.println("lg2\t" +  lg2.longValue());
		saida.println("fl\t" +  fl.longValue());
		saida.println("fl2\t" +  f2.longValue());
		saida.println("db\t" +  db.doubleValue());
		saida.println("db2\t" +  db2.doubleValue());

	}

}
