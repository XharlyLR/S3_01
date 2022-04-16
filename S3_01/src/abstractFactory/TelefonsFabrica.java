package abstractFactory;

public class TelefonsFabrica implements IAgenda{

	@Override
	public IAdreces getAdr(String adreça) {
		return null;
	}

	@Override
	public ITelefons getTlf(String tlf) {
		if (tlf == null) {
			return new TelefonVacio();
		}
		if (tlf.equalsIgnoreCase("España")) {
			return new TelefonEspaña();
		}
		else if (tlf.equalsIgnoreCase("EEUU")) {
			return new TelefonEEUU();
		}
		
		
		return new TelefonVacio();
	}

}
