import java.util.LinkedList;

public class Queue {
	public int maximal_Lengh;
	public boolean limit;
	LinkedList<Integer> lista  = new LinkedList<Integer>();
	public Queue()
	{
		
		this.limit = false;
		
	}
	public Queue(int maximal_Lengh)
	{
		
		this.maximal_Lengh = maximal_Lengh;
		this.limit = true;
		
	}
	
 	public boolean CheckIfFull()
	{
	return !this.limit ||(this.limit&&this.lista.size()< this.maximal_Lengh);	
	}
public boolean CheckIfEmpty()
{
	
	return this.lista.size() > 0;
}
public void push(int ceva)
{
	if(this.CheckIfFull())
	{
		this.lista.push(ceva);
		
	}
	else {
		System.out.println("Coada este plina! \n ");
	}
}
public String pop()
{
	
	if(CheckIfEmpty())
	{
		return this.lista.remove(lista.size()-1).toString();
	}
	else {
		return "Coada nu contine elemente! \n";
	}
	
}
	public static void main(String[] args) {
		Queue coada1 = new Queue();
		Queue coada2 = new Queue(2);
		coada1.push(1);
		coada1.push(2);
		coada1.push(3);
		System.out.println(coada1.lista);
		System.out.println(coada1.pop());
		System.out.println("Starea actuala a cozii: " + coada1.lista);
		
		coada2.push(1);
		coada2.push(2);
		coada2.push(3);
		System.out.println("Starea actuala a cozii: " + coada2.lista);
		System.out.println(coada2.pop());
		System.out.println("Starea actuala a cozii: " + coada2.lista);
		

	}

}
