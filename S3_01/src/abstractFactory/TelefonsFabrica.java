package abstractFactory;

public class TelefonsFabrica implements IAgenda{

	@Override
	public IAdreces getAdr(String adre�a) {
		return null;
	}

	@Override
	public ITelefons getTlf(String tlf) {
		if (tlf == null) {
			return new TelefonVacio();
		}
		if (tlf.equalsIgnoreCase("Espa�a")) {
			return new TelefonEspa�a();
		}
		else if (tlf.equalsIgnoreCase("EEUU")) {
			return new TelefonEEUU();
		}
		
		
		return new TelefonVacio();
	}

}
