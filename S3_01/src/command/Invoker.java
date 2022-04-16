package command;

import java.util.ArrayList;

public class Invoker {

	private ArrayList<IOperacio> operacions = new ArrayList<>();
	
	public void rebreOperacio(IOperacio operacio) {
		this.operacions.add(operacio);
	}
	
	public void realitzarOperacions() {
		this.operacions.forEach(x -> x.execute());
	}
}
