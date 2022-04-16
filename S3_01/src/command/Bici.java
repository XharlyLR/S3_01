package command;

public class Bici implements Vehicle {

	@Override
	public void arrencar() {
		System.out.println("Bici arrenca");
		
	}

	@Override
	public void accelerar() {
		System.out.println("Bici accelera");
		
	}

	@Override
	public void frenar() {
		System.out.println("Bici frena");
		
	}

}
