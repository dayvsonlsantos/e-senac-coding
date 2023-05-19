package Principal;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

import Model.Agencia;
import Model.Cliente;
import Model.Conta;
import Model.Endereco;
import Model.Transacao;

public class Principal {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Date data = c.getTime();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		// TODO Auto-generated method stub
		// System.out.println("Ol� mundo!");
		Endereco endAna; // Vari�vel do tipo Endereco
		// endAna = new Endereco(); // Criando um objeto do tipo Endereco sem valores para seus atributos, usando o construtor vazio
		Endereco endAg = new Endereco("PE", "Recife", "Santo Amaro", "Rua do Pombal", 54, "Andar 20", "55640-110");
		Agencia agSenac = new Agencia("SENAC PE", 1234, "(81)32225454", "agsenacpe@bancosenac.br", endAg);

		endAna = new Endereco("PE", "Recife", "V�zea", "Av Polid�rio", 134, "Ap 502", "55640-010");
		Cliente anaCarla = new Cliente("123.321.222-11", "Ana Carla dos Santos", new Date("04/01/2000"), 4321123, "anacsantos@gmail.com", "(81)99998-89889", endAna);
		endAna.setComplemento("Ap 503");
		Conta contaAna = new Conta(anaCarla, 321456, agSenac, data, 3456.50, 500);


		Endereco endVinicius = new Endereco("PE", "Recife", "Engenho do Meio", "Rua Berna", 161, "Casa A", "55123-010");
		Cliente vinicius = new Cliente("123.444.222-11", "Vinícius Sousa", new Date("11/07/2001"), 4521123, "viniciussousinha@gmail.com", "(81)99997-89889", endVinicius);
		endAna.setComplemento("Ap 503");
		Conta contaVinicius = new Conta(vinicius, 321458, agSenac, data, 34.50, 500);

		//System.out.println(contaAna.getSaldo());

		contaAna.sacar(348.50);
		contaAna.sacar(130);

		contaAna.depositar(3500);
		
		// System.out.println(endAna.getCidade() + " | " + endAna.getBairro() + " | " + endAna.getComplemento());
		// System.out.println(endAna.toString());


		contaVinicius.depositar(1500);
		contaAna.transferir(300, contaVinicius);

		//Ana
		System.out.println(contaAna.emitirExtrato());


		System.out.println('\n');
		System.out.println('\n');


		//Vinicius

		System.out.println(contaVinicius.emitirExtrato());

	}

}
