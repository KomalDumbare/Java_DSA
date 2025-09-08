package Patterns_Java;

class Alphabet_Right_Angle{
    public static void main(String[] args)
    {
        for(int i=1; i<=5; i++)
        {
            char ch = (char)('a' + (i-1));
            for(int j = 1; j<=i; j++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}

Output: 
a 
b b 
c c c 
d d d d 
e e e e e