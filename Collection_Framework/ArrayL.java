package Collection_Framework;
import java.util.ArrayList;
public class ArrayL {
    public static void main(String[] args)
    {
        ArrayList<String>  Fruit = new ArrayList<>();
        Fruit.add("Apple");
        Fruit.add("Mango");
        Fruit.add("Gauva");
        Fruit.add("Grapes");
        for(String s : Fruit)
        {
            System.out.print(s +" ");
        }
    }
}
