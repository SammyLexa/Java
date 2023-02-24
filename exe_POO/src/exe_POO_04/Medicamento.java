package exe_POO_04;

public class Medicamento extends Farmacia {
	private String vendidoSobrePescricao;

	public Medicamento(long id, String nome, String nomeComercial, String fabricante, String foto, float preco,
			String vendidoSobrePescricao) {
		super(id, nome, nomeComercial, fabricante, foto, preco);
		this.vendidoSobrePescricao = vendidoSobrePescricao;
	}

	public String getVendidoSobrePescricao() {
		return vendidoSobrePescricao;
	}

	public void setVendidoSobrePescricao(String vendidoSobrePescricao) {
		this.vendidoSobrePescricao = vendidoSobrePescricao;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Vendido sob pescrição médica?" + this.vendidoSobrePescricao);
	}
}
