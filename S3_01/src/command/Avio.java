package command;

public class Avio implements Vehicle {

	@Override
	public void arrencar() {
		System.out.println("Avio arrenca");
		
	}

	@Override
	public void accelerar() {
		System.out.println("Avio accelera");
		
	}

	@Override
	public void frenar() {
		System.out.println("Avio frena");
		
	}

}
