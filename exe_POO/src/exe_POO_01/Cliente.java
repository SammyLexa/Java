package exe_POO_01;

public class Cliente {
	
	private String nome;
	private int idade;
	private String telefone;
	private float dinheiro;
	private int id;
	
	public Cliente(String nome, int idade, String telefone, float dinheiro, int id) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
		this.dinheiro = dinheiro;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public float getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(float dinheiro) {
		this.dinheiro = dinheiro;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void visualizar() {
		System.out.println("***********************************");
		System.out.println("\n- Dados do Cliente:");
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade + " anos");
		System.out.println("Telefone: " + this.telefone);
		System.out.println("Saldo: " + this.dinheiro);
		System.out.println("ID: " + this.id);
		System.out.println("***********************************");
	}
	
}
