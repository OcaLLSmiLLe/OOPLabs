package Figuri;
import java.util.ArrayList;
public class ContrulerFigura {

	public static Figura AreaMax(ArrayList<Figura> Figuri)
	{
		float areaMax = 0;
		Figura maxFigura = null;
		
		
		
		for(Figura figura : Figuri)
		{
			
			if(figura.getAria() > areaMax) {
				maxFigura = figura;
			}
			
			
			
		}
		
		
		
		
		return maxFigura;
	}
	
	
	public static Figura PerimetruMax(ArrayList<Figura> Figuri) {
		
		float perimetruMax = 0;
		Figura maxFigura = null;
		for(Figura figura : Figuri) {
			
			if(figura.getPerimetru() > perimetruMax) {
				maxFigura  = figura;
			}
			
			
			
		}
		
		
		return maxFigura;
	}
	
	
	
}
