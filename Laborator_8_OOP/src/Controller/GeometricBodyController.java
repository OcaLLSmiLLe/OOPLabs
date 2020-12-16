package Controller;

import java.util.ArrayList;

import ObjectsAndInterfaces.GeometricBody;

public class GeometricBodyController {

  

	public static GeometricBody SurfaceMax(ArrayList<GeometricBody> Obiecte) {
        float MaxSurface = 0;
        GeometricBody objMax = null;

        for (GeometricBody obiect: Obiecte) {
            if (obiect.getSuprafata() > MaxSurface) {
                objMax = obiect;
            }
        }

        return objMax;
    }

    public static GeometricBody MaxVolume(ArrayList<GeometricBody> Obiecte) {
        float maxVolume = 0;
        GeometricBody objMax = null;

        for (GeometricBody obiect: Obiecte) {
            if (obiect.getVolume() > maxVolume) {
             objMax= obiect;
            }
        }

        return objMax;
    }

}
