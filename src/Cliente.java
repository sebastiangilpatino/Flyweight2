import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Cliente extends JComponent {

	Random rand = new Random();
	private Color[] colores= {Color.BLACK, Color.BLUE, Color.CYAN, Color.GREEN};
	private int[] tamaño= {100, 200, 300, 400};
	
	public void paint(Graphics g) {
		for (int i=0; i<100; i++) {
		int colorfinal = rand.nextInt(4);
   	 	circulo circul = FabricaCirculo.getCirculo(colores[colorfinal],tamaño[colorfinal]);
		circul.dibujar(g, colores[colorfinal] , rand.nextInt(200), rand.nextInt(200), tamaño[colorfinal]);
		}
     }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	   JFrame window = new JFrame();
		    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    window.setBounds(30, 30, 500, 500);
		    window.getContentPane().add(new Cliente());
		    window.setVisible(true);
	}

}
