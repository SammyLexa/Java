package exe_POO_04;

public class Perfumaria extends Farmacia {
	
	private String fragancia;

	public Perfumaria(long id, String nome, String nomeComercial, String fabricante, String foto, float preco,
			String fragancia) {
		super(id, nome, nomeComercial, fabricante, foto, preco);
		this.fragancia = fragancia;
	}

	public String getFragancia() {
		return fragancia;
	}

	public void setFragancia(String fragancia) {
		this.fragancia = fragancia;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Fragância: " + this.fragancia);
	}
	
	

}
