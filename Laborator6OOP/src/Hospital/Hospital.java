package Hospital;

import java.util.ArrayList;

import Main.Person;
import Utils.*;

public class Hospital {
	  public ArrayList<Person> persons;
	    public ArrayList<Department> departments;

	    public String name;
	    public Phone phone;

	    private Adress address;

	    public Adress getAddress() {
	        return address;
	    }

	    public void setAddress(Adress address) {
	        this.address = address;
	    }
}
