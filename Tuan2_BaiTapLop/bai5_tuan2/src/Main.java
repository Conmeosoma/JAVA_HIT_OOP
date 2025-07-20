public class Main {
    public static void main(String[] args) {
        System.out.println("Bang cuu chuong 5");
        for(int i = 0 ;i <= 10 ;i++)
        {
            System.out.println("5 * " + i + " = " + (5 * i));
        }
        System.out.println("for: ");
        for(int i = 1; i <= 100 ;i++)
        {
            if( i % 2 == 0)
            {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("while: " );
        int n = 1;
        while (n <= 100)
        {
            if(n % 2 == 0)
            {
                System.out.print(n + " ");
            }
            n++;
        }

    }
}