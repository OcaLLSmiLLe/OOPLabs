package main;
import java.util.ArrayList;
import java.util.List;
import Litere.*;
public class Main {

	public static void main(String[] args) {
		List<Object> litere = new ArrayList<Object>();
		litere.add(new A());
		litere.add(new B());
		litere.add(new C());
		litere.add(new D());
		litere.add(new E());
		litere.add(new F());
		litere.add(new G());
		litere.add(new H());
		litere.add(new I());
		litere.add(new J());
		
		
		
		for(Object litera: litere) {
		System.out.println(litera.toString());
		System.out.println("***************************************");
		}

	}

}
