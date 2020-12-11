import java.awt.geom.Area;
 
public class Box {
	public float inaltime;
public float latime;
public float adancime;
public Box( )
{
	this.inaltime = this.latime = this.adancime = 1;
}
public Box(float dimensiune)
{
	
	this.inaltime = this.latime = this.adancime = dimensiune;
}
public Box(float i, float l, float a)
{
 this.inaltime = i;
 this.latime = l;
 this.adancime = a;
	
}
public float Area()
{
	return(this.inaltime* this.latime + this.latime* this.inaltime + this.latime * this.adancime) * 2;
	
}
public float Volume()

{
	
	return this.inaltime * this.adancime * this.latime;
	
	
}
	public static void main(String[] args) 
	{
		Box ObiectCutie_Standard = new Box();
		Box ObiectCutie_cube = new Box(5);
		Box Obiect_cutie = new Box(1, 2,3);
		System.out.println("<<<<<<<<<<<<Aria obiectelor cutie>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("-----------------------------------------------------------");
		System.out.println("Aria cutiei standard: " + ObiectCutie_Standard.Area() + "\n");
		System.out.println( "Aria cutiei cub: " + ObiectCutie_cube.Area() + "\n");
		System.out.println("Aria obiectului cutie: " + Obiect_cutie.Area() + "\n");
		System.out.println("<<<<<<<<<<<<<Volumul obiectelor cutie>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("-------------------------------------------------------");
		
		System.out.println("Volumul cutiei standard: " + ObiectCutie_Standard.Volume() + "\n");
		System.out.println("Volumul cutiei cub: " + ObiectCutie_cube.Volume() + "\n");
		System.out.println(" Volumul Obiectului cutie:  " + Obiect_cutie.Volume() + "\n");
		

	}

}
