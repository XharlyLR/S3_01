package abstractFactory;

public class FabricaProductor {

	public static IAgenda getFactory(String tipoFabrica) {
		
		if (tipoFabrica.equalsIgnoreCase("telefon")) {
			return new TelefonsFabrica();
		}
		else if (tipoFabrica.equalsIgnoreCase("adreça")) {
			return new AdrecesFabrica();
		}
		
		return null;
	}
}
