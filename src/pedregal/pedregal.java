package pedregal;

public class pedregal {
	int dx,dy; //TERRENO
	int fCasa,lCasa; //CASA
	int cantidadDePe�ascos; // PE�ASCOS
		
	public pedregal() {
		this.dx = 1;
		this.dy = 1;
		this.fCasa = 1;
		this.lCasa = 1;
		this.cantidadDePe�ascos = 0;
	}
			
	public pedregal(int dx, int dy, int fCasa, int lCasa, int cantidadDePe�ascos) {
		this.dx = dx;
		this.dy = dy;
		this.fCasa = fCasa;
		this.lCasa = lCasa;
		this.cantidadDePe�ascos = cantidadDePe�ascos;
	}
	
	
	public int getDx() {
		return dx;
	}
	public void setDx(int dx) {
		this.dx = dx;
	}
	public int getDy() {
		return dy;
	}
	public void setDy(int dy) {
		this.dy = dy;
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


}