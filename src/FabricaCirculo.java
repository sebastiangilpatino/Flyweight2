import java.awt.Color;
import java.util.HashMap;

public class FabricaCirculo {

	private static final HashMap <String, circulo> circulo_hash = new HashMap<String, circulo >();
	
	public static circulo getCirculo(Color color, int Tama�o) {
		
		String x = Integer.toString(Tama�o);
		String y = color.toString();
		String yx = y.concat(x);
		circulo circle = circulo_hash.get(yx);
		
		if(circle == null) {
			circle = new circulo(color, Tama�o);
			circulo_hash.put(yx,circle);
			
		}
				
		return circle;
	}
	
}
