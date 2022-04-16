package abstractFactory;

public class Main {

	public static void main(String[] args) {
		IAgenda fabricaTlf = FabricaProductor.getFactory("telefon");
		ITelefons iTlf1 = fabricaTlf.getTlf("España");
		
		iTlf1.tal();
		
		IAgenda fabricaAdr = FabricaProductor.getFactory("adreça");
		IAdreces iAdr1 = fabricaAdr.getAdr(null);
		
		//iAdr1.tal()

	}

}
