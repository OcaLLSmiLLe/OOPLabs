package Figuri;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Figura> figuri = new ArrayList<>();
		figuri.add(new Patrat(10));
		figuri.add(new Dreptunghi(2, 45));
		figuri.add(new Triunghi(10, 20, 30));
		System.out.println(ContrulerFigura.AreaMax(figuri).getAria());
		System.out.println(ContrulerFigura.PerimetruMax(figuri).getPerimetru());
		
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
		float razaCerc = 3;
		
		figuri.add(new Figura() {
			
		public float getAria() {
			return (float) ( razaCerc * razaCerc *Math.PI);
		}
			public float getPerimetru() {
				return (float) (razaCerc * 2 *Math.PI);
			}
			
			
			
		});	
		
		
		
		System.out.println(ContrulerFigura.AreaMax(figuri).getAria());
		System.out.println(ContrulerFigura.PerimetruMax(figuri).getPerimetru());	
		
		
		
	}

}
