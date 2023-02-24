package exe_POO_04;

public class TestaFarmacia {
	public static void main(String[] args) {
		
		Farmacia r1 = new Farmacia (123, "Acetaminofeno", "Paracetamol", "MedQuímica", "-", 12.0f);
	
		Farmacia r2 = new Farmacia (321, "Metamizol", "Dipirona", "NeoQuímica", "-", 22.0f);
		
		Perfumaria p1 = new Perfumaria (567, "Prada", "Candy", "Prada", "-", 300, "rosas de chocolate");
		
		Medicamento m1 = new Medicamento(321, "Metamizol", "Dipirona", "NeoQuímica", "-", 22.0f, "sim");
				
		r1.visualizar();
		r2.visualizar();
		p1.visualizar();
		m1.visualizar();
	}
}
