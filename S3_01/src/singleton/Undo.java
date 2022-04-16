package singleton;

import java.util.ArrayList;
import java.util.ListIterator;

public class Undo {
	
	private static Undo instancia;
	private static ArrayList<String> comandos;
	
	private Undo() {
		comandos = new ArrayList<String>();
	}
	
	public static Undo getInst() {
		if(instancia == null) {
			instancia = new Undo();
		}
		
		return instancia;
	}

	public void nouComando(String string) {
		if (comandos.size() >= 5) {
			comandos.remove(0);
		}
		comandos.add(string);
	}
	
	public void undoComando() {
		ListIterator<String> it = comandos.listIterator();
		
		while (it.hasNext()) {
			 it.next();
		}
		
		if(it.hasPrevious()) {
			it.previous();
			it.remove();
		}
		
		else
			System.out.println("No hi ha cap comando");
	}
	
	public String veureComando() {
		ListIterator<String> it = comandos.listIterator();
		
		while (it.hasNext()) {
			it.next();
		}
		
		if(it.hasPrevious()) {
			return it.previous();
		}
		
		else
			return "No hi ha cap comando";		
	}
	
	public String veureTotsComandos() {
		String str = "";
		ListIterator<String> it = comandos.listIterator();
		
		while (it.hasNext()) {
			 it.next();
		}
		
		while (it.hasPrevious()) {
			 str += it.previous() + "\n";
		}
		
		if(str.equals(""))
			return "No hi ha cap comando";	
		else
			return str;
	}
}
