package command;

public class ArrencarImpl implements IOperacio{

	private Vehicle vehicle;
	
	
	public ArrencarImpl(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public void execute() {
		this.vehicle.arrencar();
		
	}

}
