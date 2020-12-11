package dao;

public class Stack {
    private Cell lista;
Stack(){
    lista = null;
}

private Stack(Cell colection) {
    lista = colection;
}
public boolean este_oare_goala()
{
    return lista == null;
}
public Object virf()
{
    return lista.primul;

}
public void pop(){
    lista = lista.restul;
}
public void push(Object obiect)
{
    lista = new Cell(obiect, lista);

}



public static Stack empty()
{
    return new Stack(null);
}




    private static class Cell{
        Object primul;
        Cell restul;
        Cell(Object obj, Cell cel)
        {
            primul = obj;
            restul = cel;


        }



    }
}
