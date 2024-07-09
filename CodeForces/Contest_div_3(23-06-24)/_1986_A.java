import java.util.*;
public class _1986_A
{
    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);
        int test_case = rs.nextInt();
        for(int i = 0;i < test_case ;i++)
        {
            int x = rs.nextInt();
            int y =rs.nextInt();
            int z = rs.nextInt();
            int result = Math.abs(x-x)+ Math.abs(x-y)+ Math.abs(x-z);
            result = Math.min(result, Math.abs(y-x)+Math.abs(y-y)+Math.abs(y-z));
            result = Math.min(result, Math.abs(x-z)+Math.abs(z-y)+Math.abs(z-z));
            System.out.println(result);
        }
    }   
}