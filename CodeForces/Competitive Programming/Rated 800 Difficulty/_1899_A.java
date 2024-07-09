import java.util.*;
public class _1899_A {
   public static void main(String[] args) {
    Scanner rs = new Scanner(System.in);
    int test_case = rs.nextInt();
    for(int i = 0; i < test_case; i++)
    {
        int n = rs.nextInt();
        if(n%3 == 0)
        {
            System.out.println("Second");
        }
        else
        {
            System.out.println("First");
        }
    }
} 
}
