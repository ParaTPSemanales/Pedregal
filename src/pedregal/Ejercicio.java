package pedregal;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Ejercicio {

	private static Scanner sc;
	
	
	public static void main(String[] args) throws FileNotFoundException {
		sc = new Scanner (new File("pedregal.in"));	
		Pedregal pedregal = new Pedregal ();
		pedregal.setAnchoTerreno(sc.nextInt());
		int anchoTerreno= pedregal.getAnchoTerreno();
		pedregal.setAltoTerreno(sc.nextInt());
		int altoTerreno=pedregal.getAltoTerreno();
		pedregal.setfCasa(sc.nextInt());
		pedregal.setlCasa(sc.nextInt());
		pedregal.setCantidadDePeñascos(sc.nextInt());
		int [][]terreno=new int [altoTerreno][anchoTerreno];
		while (sc.hasNextInt()) {
			int y=sc.nextInt()-1;
			int x=altoTerreno-sc.nextInt();
			terreno[x][y]=1;
		}
		
		/* PARA VER MATRIZ DEL TERRENO CON PEÑASCOS*/
		for (int i = 0; i< altoTerreno; i++) {
			for (int j = 0; j < anchoTerreno; j++) {
				System.out.print(terreno[i][j] + "\t");
			}
		 System.out.println(" ");
		}		
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Con 1 figuraran los lugares donde entre la casa, con 0 los lugares que no entra: ");
		System.out.println(" ");
		int [][] matrizConLugar =new int [altoTerreno][anchoTerreno];
		matrizConLugar=pedregal.matrizDondeEntraLaCasa(terreno, pedregal);
		
		for (int i = 0; i <pedregal.getAltoTerreno(); i++) {
			for (int j = 0; j < pedregal.getAnchoTerreno(); j++) {
				System.out.print(matrizConLugar[i][j] + "\t");
			}
		 System.out.println(" ");
		}		
		
		///PARA VER DONDE PONER LA CASA, NO DEBERIA SER UN FOR.
		int a=0,b=0;
		for (int i = altoTerreno-1; i>0; i--) {
			for (int j = 0; j < anchoTerreno; j++) {
				if (matrizConLugar[i][j]==1) {
					a=i;
					b=j;
					i=0;
					j=pedregal.getAnchoTerreno();
				}
			}
		} 
		System.out.println("La posicion para poner la casa es:" + a + "," + b );
		
		}
		
}

