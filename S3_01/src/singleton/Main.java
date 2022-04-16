package singleton;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Undo u = Undo.getInst();
		int op = 0;
		
		do {
			System.out.println("Marca amb el número coresponent l'opció a executar:\n"
					+ "0 - Tancar el programa\n"
					+ "1 - Introduir un nou comando\n"
					+ "2 - Veure el comando actual\n"
					+ "3 - Veure els últims comandos\n"
					+ "4 - Desfer últim comando");
			op = sc.nextInt();
			sc.nextLine();
			
			switch (op) {
			case 0:
				break;
			case 1:
				System.out.println("Introdueix el nou comando:");
				u.nouComando(sc.nextLine());
				break;
			case 2:
				System.out.println(u.veureComando());
				break;
			case 3:
				System.out.println(u.veureTotsComandos());
				break;
			case 4:
				u.undoComando();
				break;
			default:
				System.out.println("Error al introduir el número\n");
				break;
			}
		} while (op != 0);
	}

}
