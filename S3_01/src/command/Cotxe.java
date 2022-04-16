package command;

public class Cotxe implements Vehicle {

	@Override
	public void arrencar() {
		System.out.println("Cotxe arrenca");
		
	}

	@Override
	public void accelerar() {
		System.out.println("Cotxe accelera");
		
	}

	@Override
	public void frenar() {
		System.out.println("Cotxe frena");
		
	}

}
