import java.awt.Color;
import java.awt.Graphics;

public interface ICirculo {

	public Color getColor();
	public int getRadio();
	public void dibujar(Graphics g, Color color, int x, int y, int Tamaño);
}