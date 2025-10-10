package Patterns_Java;

class AlphabetPattern1{
    public static void main(String[] args)
    {
        for(int i=1; i<=5; i++)
        {
            for(char j='a'; j<='e'; j++)
            {
                // char ch = (char)('a' + (j-1));
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}

output: 
a b c d e 
a b c d e 
a b c d e 
a b c d e 
a b c d e