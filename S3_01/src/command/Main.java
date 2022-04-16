package command;

public class Main {

	public static void main(String[] args) {
		Avio avio1 = new Avio();
		Cotxe cotxe1 = new Cotxe();
		Vaixell vaixell1 = new Vaixell();
		Bici bici1 = new Bici();
		
		ArrencarImpl opArrencarAvio = new ArrencarImpl(avio1);
		AccelerarImpl opAccelerarAvio = new AccelerarImpl(avio1);
		FrenarImpl opFrenarAvio = new FrenarImpl(avio1);
		
		ArrencarImpl opArrencarCotxe = new ArrencarImpl(cotxe1);
		AccelerarImpl opAccelerarCotxe = new AccelerarImpl(cotxe1);
		FrenarImpl opFrenarCotxe = new FrenarImpl(cotxe1);
		
		ArrencarImpl opArrencarVaixell = new ArrencarImpl(vaixell1);
		AccelerarImpl opAccelerarVaixell = new AccelerarImpl(vaixell1);
		FrenarImpl opFrenarVaixell = new FrenarImpl(vaixell1);
		
		ArrencarImpl opArrencarBici = new ArrencarImpl(bici1);
		AccelerarImpl opAccelerarBici = new AccelerarImpl(bici1);
		FrenarImpl opFrenarBici = new FrenarImpl(bici1);
		
		Invoker ivk = new Invoker();
		ivk.rebreOperacio(opArrencarAvio);
		ivk.rebreOperacio(opAccelerarAvio);
		ivk.rebreOperacio(opFrenarAvio);
		
		ivk.rebreOperacio(opArrencarCotxe);
		ivk.rebreOperacio(opAccelerarCotxe);
		ivk.rebreOperacio(opFrenarCotxe);
		
		ivk.rebreOperacio(opArrencarVaixell);
		ivk.rebreOperacio(opAccelerarVaixell);
		ivk.rebreOperacio(opFrenarVaixell);
		
		ivk.rebreOperacio(opArrencarBici);
		ivk.rebreOperacio(opAccelerarBici);
		ivk.rebreOperacio(opFrenarBici);
		
		ivk.realitzarOperacions();

	}

}
