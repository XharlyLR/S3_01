package abstractFactory;

public class AdrecesFabrica implements IAgenda{

	@Override
	public IAdreces getAdr(String adreça) {
		//Lo mismo 	que en telefonsfabrica pero con adreces
//		if (adreça == null) {
//			return new AdreçaVacio();
//		}
//		if (adreça.equalsIgnoreCase("España")) {
//			return new AdreçaEspaña();
//		}
//		else if (adreça.equalsIgnoreCase("EEUU")) {
//			return new AdreçaEEUU();
//		}
//		
//		
//		return new AdreçaVacio();
//	}
		return null;
	}

	@Override
	public ITelefons getTlf(String tlf) {
		return null;
	}

}
