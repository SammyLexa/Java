package exe_POO_01;



public class TestaCliente {
	public static void main(String[] args) {
		Cliente c1 = new Cliente ("Lucas" , 21, "(12)9988-7711", 50.0f, 7899);
	
		Cliente c2 = new Cliente ("Mariazinha", 90, "(11)8877-2211", 1000f, 3218);
	
		c1.visualizar();
		c2.visualizar();
	}
}
