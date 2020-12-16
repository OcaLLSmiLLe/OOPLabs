package ObjectsAndInterfaces;

public class Paralepiped implements GeometricBody{
private float lungime;
private float inaltime;
private float latime;
public Paralepiped(float lungime, float inaltime, float latime) {
	this.lungime = lungime;
	this.inaltime = inaltime;
	this.latime  = latime;
}
@Override
public float getVolume() {
	// TODO Auto-generated method stub
	return inaltime * lungime * latime;
}
@Override
public float getSuprafata() {
	// TODO Auto-generated method stub
	return 2 * (lungime * latime + inaltime* inaltime * inaltime * latime);
}

	
}
