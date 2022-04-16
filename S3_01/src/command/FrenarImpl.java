package command;

public class FrenarImpl implements IOperacio{

	private Vehicle vehicle;
	
	
	public FrenarImpl(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public void execute() {
		this.vehicle.frenar();
		
	}

}