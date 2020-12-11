package Main;

import Utils.*;

import java.util.Date;


public class Person {
    public String title;
    //public String givenName;
    //public String middleName;
    //public String familyName;
    public Date birthDate;
    public Gender gender;
    public Phone phone;

    public FullName name;
    public Adress homeAddress;
    

    public FullName getName() {
        return name;
    }

    public void setName(FullName name) {
        this.name = name;
    }

    public Adress getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Adress homeAddress) {
        this.homeAddress = homeAddress;
    }
}
