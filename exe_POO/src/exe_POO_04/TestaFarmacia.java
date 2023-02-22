package exe_POO_04;

public class TestaFarmacia {
	public static void main(String[] args) {
		
		Farmacia m1 = new Farmacia (123, "Acetaminofeno", "Paracetamol", "MedQuímica", "-", 12.0f);
	
		Farmacia m2 = new Farmacia (321, "Metamizol", "Dipirona", "NeoQuímica", "-", 22.0f);
	
		m1.visualizar();
		m2.visualizar();
	}
}
