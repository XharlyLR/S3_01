package command;

public class AccelerarImpl implements IOperacio{

	private Vehicle vehicle;
	
	
	public AccelerarImpl(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public void execute() {
		this.vehicle.accelerar();
		
	}

}