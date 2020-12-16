package ObjectsAndInterfaces;

public class Cub implements GeometricBody{
private float  muchie;

public Cub(float muchie){
	this.muchie = muchie;
}

	@Override
	public float getVolume() {
	
		
		return this.muchie * this.muchie * this.muchie;
	}

	@Override
	public float getSuprafata() {
	
		return this.muchie * this.muchie * 6;
	}

}
