package br.com.cap10.exception;

public class TratamentoArray {

	public static void main(String[] args) {

		String[]amigos = {"claudia","vanessa","raul","sidnei"};
		
		for(byte num = 0; num < amigos.length ;num++)
			System.out.println("Amigo "+(num+1)+ ":" + amigos[num]);
	}

}
