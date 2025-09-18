public class Lab_002
{
    public static void main(String[] args)
    {
        int n=9;

        System.out.printf("Multiplication Table for %d:%n",n );
        System.out.println("--------" );
        for(int i=1; i<=10; i++)
        {

            System.out.printf("%d * %d = %d%n",n, i,n *i );
        }
    }
}
