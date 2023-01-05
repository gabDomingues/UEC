package application;

import entities.Luta;
import entities.Lutador;

public class Program {

	public static void main(String[] args) {

		Lutador[] l = new Lutador[6];

		l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 1, 2);
		l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 3, 2);
		l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 1, 2);
		l[3] = new Lutador("Dead Cole", "Australia", 28, 1.93f, 80.9f, 12, 1, 2);
		l[4] = new Lutador("UF0Cobol", "Brasil", 37, 1.7f, 119.3f, 5, 3, 4);
		l[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 4, 2);
		
		l[0].status();
		l[1].status();
		
		
		Luta UEC01 = new Luta();
		UEC01.marcarLuta(l[0], l[1]);
		UEC01.lutar();
		
		l[0].status();
		l[1].status();
		System.out.println("---------------------------------------");
		Luta UEC02 = new Luta();
		l[3].status();
		l[1].status();
		UEC02.marcarLuta(l[3], l[1]);
		
	}

}
