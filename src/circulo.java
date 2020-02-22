import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class circulo implements ICirculo {

	private int PosX, PosY, Radio=100, Tama�o;
	private Color color;

	public circulo(Color color, int Tama�o){
		color=this.color;
		Tama�o = this.Tama�o;
	}
	

	public int[] GetPosicion() {
		int []posiciones = new int [2];
		posiciones[0]=PosX;
		posiciones[1]=PosY;
		return posiciones;
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	@Override
	public int getRadio() {
		// TODO Auto-generated method stub
		return Radio;
	}



	@Override
	public void dibujar(Graphics g, Color colorin, int x, int y, int tama�o) {
		// TODO Auto-generated method stub
		((Graphics2D) g).setPaint(colorin);
		g.drawOval(x, y, tama�o, tama�o);
	}
}
