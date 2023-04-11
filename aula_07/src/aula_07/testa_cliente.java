package aula_07;

import java.time.LocalDate;

public class testa_cliente {

	public static void main(String[] args) {
		LocalDate data1 = LocalDate.of(2004, 07, 31);
		LocalDate data2 = LocalDate.of(1971, 10, 03);

		ClientePessoaFisica cliente1 = new ClientePessoaFisica("Ketelyn Medina", data1, "(11) 92222-2222",
				"Eemail@gmail.com", "Av. Cúrio, 860", "222.222.222-80");
		ClientePessoaJuridica cliente2 = new ClientePessoaJuridica("Eliana Rodrigues", data2, "(12) 93333-3333",
				"Kemail5@gmail.com", "Av. Cúrio, 860", "333.333.333-90");

		cliente1.visualizar();
		System.out.println("\n");
		cliente2.visualizar();
	}

}
