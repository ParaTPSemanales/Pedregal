package pedregal;

public class Pedregal {
	int AnchoTerreno,AltoTerreno; //TERRENO
	int fCasa,lCasa; //CASA
	int cantidadDePe�ascos; // PE�ASCOS
		
	public Pedregal() {
		this.AnchoTerreno = 1;
		this.AltoTerreno = 1;
		this.fCasa = 1;
		this.lCasa = 1;
		this.cantidadDePe�ascos = 0;
	}
			
	public Pedregal(int dx, int dy, int fCasa, int lCasa, int cantidadDePe�ascos) {
		this.AnchoTerreno = dx;
		this.AltoTerreno = dy;
		this.fCasa = fCasa;
		this.lCasa = lCasa;
		this.cantidadDePe�ascos = cantidadDePe�ascos;
	}
	
	
	public int getAnchoTerreno() {
		return AnchoTerreno;
	}
	public void setAnchoTerreno(int AnchoTerreno) {
		this.AnchoTerreno = AnchoTerreno;
	}
	public int getAltoTerreno() {
		return AltoTerreno;
	}
	public void setAltoTerreno(int AltoTerreno) {
		this.AltoTerreno = AltoTerreno;
	}
	public int getfCasa() {
		return fCasa;
	}
	public void setfCasa(int fCasa) {
		this.fCasa = fCasa;
	}
	public int getlCasa() {
		return lCasa;
	}
	public void setlCasa(int lCasa) {
		this.lCasa = lCasa;
	}
	public int getCantidadDePe�ascos() {
		return cantidadDePe�ascos;
	}
	public void setCantidadDePe�ascos(int cantidadDePe�ascos) {
		this.cantidadDePe�ascos = cantidadDePe�ascos;
	}
	
	public boolean hayPeniasco (int peniascos[][],int i, int j) {
		if(peniascos[i][j]==1)
			return true;
		return false;
	}
	
	public boolean hayPeniascoEnSubmatriz (int peniascos[][],int XdondeEmpieza,int YdondeEmpieza, Pedregal pedregal ) {
		for (int i = 0; i < pedregal.getlCasa(); i++) {
			for (int j = 0; j < pedregal.getfCasa(); j++) {
				if(pedregal.hayPeniasco(peniascos,i+XdondeEmpieza,j+YdondeEmpieza))
						return true;
			}
		}
		return false;
	}
	
	public int [][] matrizDondeEntraLaCasa (int pe�ascos[][],Pedregal pedregal){
		int [][]matrizDisponibles = new int [pedregal.getAltoTerreno()][pedregal.getAnchoTerreno()];
		for (int i = 0; i < pedregal.getAltoTerreno(); i++) 
			for (int j=0;j< pedregal.getAnchoTerreno(); j++) {
				if (j+pedregal.getfCasa()>pedregal.getAnchoTerreno() || i+pedregal.getlCasa()>pedregal.getAltoTerreno())
						matrizDisponibles[i][j]=0;
				else {
					if (pedregal.hayPeniascoEnSubmatriz(pe�ascos, i, j, pedregal))
						matrizDisponibles[i][j]=0;
					else
						matrizDisponibles[i][j]=1;
				}

			}
		return matrizDisponibles;
	}
}