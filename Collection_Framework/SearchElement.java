package Collection_Framework;

import java.util.ArrayList;
public class SearchElement {

public static void main(String[] args)
{
    ArrayList <Integer> List = new ArrayList <Integer>();

    List.add(10);
    List.add(20);
    List.add(30);
    List.add(40);
    List.add(50);
    List.add(60);

    if(List.contains(10))
    {
        System.out.println("Element found");
    }
    else{
        System.out.println("Element is not found");
    }

    }
}
