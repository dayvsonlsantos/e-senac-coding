package Model;

public class Agencia {

	private String nome;
	private int numero;
	private String telefone;
	private String email;
	private Endereco endereco;

	public Agencia() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Agencia(String nome, int numero, String telefone, String email, Endereco endereco) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return "Agencia: " + nome + ", N�mero: " + numero + ", Telefone: " + telefone + ", E-mail: " + email
				+ "\n" + endereco;
	}

}
