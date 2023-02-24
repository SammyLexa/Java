package exe_POO_01;

public class PessoaJuridica extends Cliente{
	public int cnpj;

	public PessoaJuridica(String nome, int idade, String telefone, float dinheiro, int id, int cnpj) {
		super(nome, idade, telefone, dinheiro, id);
		this.cnpj = cnpj;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("CNPJ: " + this.cnpj);
	}
	
}
