package Main;
import java.util.ArrayList;
import ObjectsAndInterfaces.*;
import Controller.GeometricBodyController;
public class Main {

	public static void main(String[] args) {
	ArrayList<GeometricBody> obiecte = new ArrayList<GeometricBody>();
	
	obiecte.add(new Cub(6));
	obiecte.add(new Sfera(10));
	 obiecte.add(new Paralepiped(1,1,1));
System.out.println(GeometricBodyController.MaxVolume(obiecte).getVolume());	
	
System.out.println(GeometricBodyController.SurfaceMax(obiecte).getSuprafata());	
	
	
	}

}
