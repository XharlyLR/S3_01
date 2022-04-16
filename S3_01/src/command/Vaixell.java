package command;

public class Vaixell implements Vehicle {

	@Override
	public void arrencar() {
		System.out.println("Vaixell arrenca");
		
	}

	@Override
	public void accelerar() {
		System.out.println("Vaixell accelera");
		
	}

	@Override
	public void frenar() {
		System.out.println("Vaixell frena");
		
	}

}
