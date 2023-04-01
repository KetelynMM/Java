package conta.model;

public abstract class Conta {

	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;

	public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}

	public Conta() {}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean sacar(float valor) {
		if (this.getSaldo() < valor) {
			System.out.println("\nSaldo insuficiente");
			return false;

		} else {
			this.setSaldo(this.getSaldo() - valor);
			return true;
			
		}
	}

	public void depositar(float valor) {
		this.setSaldo(this.getSaldo() + valor);

	}

	public void visualizar() {
		String tipo = "";
		
		switch (this.getTipo()) {
		case 1:
			tipo = "Conta Corrente";
			break;
		case 2:
			tipo = "Conta Poupança";
			break;
		}

		System.out.println("++++++++++++++++++++++++++++");
		System.out.println("       Dados da Conta       ");
		System.out.println("++++++++++++++++++++++++++++");
		System.out.println("Numero da Conta: " + this.getNumero());
		System.out.println("Numero da Agência: " + this.getAgencia());
		System.out.println("Tipo da Conta: " + tipo);
		System.out.println("Nome do Titular da Conta: " + this.getTitular());
		System.out.println("Saldo da Conta: " + this.getSaldo());
	}

}
