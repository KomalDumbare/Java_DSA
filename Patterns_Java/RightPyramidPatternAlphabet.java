package Patterns_Java;

class RightPyramidPatternAlphabet{
    public static void main(String[] args)
    {
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5-i; j++)
            {
                System.out.print(" ");;
            }
            for(char j='A'; j<= (char)('A'+ i-1); j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

output:

    A
   AB
  ABC
 ABCD
ABCDE
