
public class UnluckyException extends Exception {
protected String text = "13! You are not allowed to do this";
UnluckyException(){}
public void arata() {
	System.out.println(this.text);
}
}

