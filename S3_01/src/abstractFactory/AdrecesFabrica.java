package abstractFactory;

public class AdrecesFabrica implements IAgenda{

	@Override
	public IAdreces getAdr(String adre�a) {
		//Lo mismo 	que en telefonsfabrica pero con adreces
//		if (adre�a == null) {
//			return new Adre�aVacio();
//		}
//		if (adre�a.equalsIgnoreCase("Espa�a")) {
//			return new Adre�aEspa�a();
//		}
//		else if (adre�a.equalsIgnoreCase("EEUU")) {
//			return new Adre�aEEUU();
//		}
//		
//		
//		return new Adre�aVacio();
//	}
		return null;
	}

	@Override
	public ITelefons getTlf(String tlf) {
		return null;
	}

}
