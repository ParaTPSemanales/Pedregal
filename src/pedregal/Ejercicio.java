package pedregal;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Ejercicio {

	private static Scanner sc;
	
	
	public static void main(String[] args) throws FileNotFoundException {
		sc = new Scanner (new File("pedregal.in"));	
		pedregal pedregal = new pedregal ();
		pedregal.setDx(sc.nextInt());
		pedregal.setDy(sc.nextInt());
		pedregal.setfCasa(sc.nextInt());
		pedregal.setlCasa(sc.nextInt());
		pedregal.setCantidadDePeñascos(sc.nextInt());
		int [][]terreno=new int [pedregal.getDx()][pedregal.getDy()];
		while (sc.hasNextInt()) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			terreno[x-1][y-1]=1;
		}
		
		/* PARA VER MATRIZ DEL TERRENO CON PEÑASCOS*/
		for (int i = 0; i <pedregal.getDx(); i++) {
			for (int j = 0; j < pedregal.getDy(); j++) {
				System.out.print(terreno[i][j] + "\t");
			}
		 System.out.println(" ");
		}		
		
		
		
		}
}
