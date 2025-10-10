package Collection_Framework;
import java.util.ArrayList;
public class UpdateList {
    public static void main(String[] args)
    {
        ArrayList <String> al = new ArrayList<String>();

        al.add("Black");
        al.add("Red");
        al.add("white");
        al.add("Orange");
        al.add("Blue");
        al.add("Purple");

        al.set(3,"Green");

        System.out.println(al);

    }
    
}
