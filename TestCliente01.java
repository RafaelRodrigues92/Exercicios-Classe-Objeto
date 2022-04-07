package aula06;

public class TestCliente {

	public static void main(String[] args) {
		
		Clientes objetoCliente01 = new Clientes();
		Clientes objetoCliente02 = new Clientes();
		Clientes objetoCliente03 = new Clientes();
		Clientes objetoCliente04 = new Clientes();
		
		objetoCliente01.nome = "Rafael";
		objetoCliente01.idade = 29;
		objetoCliente01.telefone = 993849378;
		objetoCliente01.bairro = "Centro";

		objetoCliente02.nome = "Pedro";
		objetoCliente02.idade = 20;
		objetoCliente02.telefone = 955849378;
		objetoCliente02.bairro = "Ipiranga";
		
		objetoCliente03.nome = "Daniel";
		objetoCliente03.idade = 19;
		objetoCliente03.telefone = 993800378;
		objetoCliente03.bairro = "Lapa";
		
		objetoCliente04.nome = "Rosana";
		objetoCliente04.idade = 67;
		objetoCliente04.telefone = 993800378;
		objetoCliente04.bairro = "Jabaquara";
		
		System.out.println("Cliente: " + objetoCliente01.nome);
		System.out.println("Idade: " + objetoCliente01.idade);
		System.out.println("Telefone: " + objetoCliente01.telefone);
		System.out.println("Morador do bairro: " + objetoCliente01.bairro);
		
		System.out.println("============================");
		
		System.out.println("Cliente: " + objetoCliente02.nome);
		System.out.println("Idade: " + objetoCliente02.idade);
		System.out.println("Telefone: " + objetoCliente02.telefone);
		System.out.println("Morador do bairro: " + objetoCliente02.bairro);
		
		System.out.println("============================");
		
		System.out.println("Cliente: " + objetoCliente03.nome);
		System.out.println("Idade: " + objetoCliente03.idade);
		System.out.println("Telefone: " + objetoCliente03.telefone);
		System.out.println("Morador do bairro: " + objetoCliente03.bairro);
		
		System.out.println("============================");
		
		System.out.println("Cliente: " + objetoCliente04.nome);
		System.out.println("Idade: " + objetoCliente04.idade);
		System.out.println("Telefone: " + objetoCliente04.telefone);
		System.out.println("Morador do bairro: " + objetoCliente04.bairro);

	}

}
