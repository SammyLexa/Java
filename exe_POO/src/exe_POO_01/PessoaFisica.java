package exe_POO_01;

public class PessoaFisica extends Cliente{
	public int cpf;

	public PessoaFisica(String nome, int idade, String telefone, float dinheiro, int id, int cpf) {
		super(nome, idade, telefone, dinheiro, id);
		this.cpf = cpf;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("CPF: " + this.cpf);
	}

}
