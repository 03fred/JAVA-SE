package br.com.cap12.AnatomiaClasses;

public class TestaCliente {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();

		cliente1.nome ="João";
		cliente1.email = "Joãofeijão@gmail.com";
		cliente1.credito =  12.4;
		

		cliente2.nome ="Maria";
		cliente2.email = "maria@gmail.com";
		cliente2.credito =  12.24;
		
		
		
		System.out.print("\n dados do cliente 1\n");
		System.out.println("Nome:\t\t"+ cliente1.nome);
		System.out.println("Email:\t\t"+ cliente1.email);
		System.out.println("Credito:\t\t"+ cliente1.credito);

		
		System.out.print("\n dados do cliente 2\n");
		System.out.println("Nome:\t\t"+ cliente2.nome);
		System.out.println("Email:\t\t"+ cliente2.email);
		System.out.println("Credito:\t\t"+ cliente2.credito);

	}
	

	
}
