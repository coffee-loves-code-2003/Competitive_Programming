import java.util.*;
public class _1982_A
{
    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);
        int test_case = rs.nextInt();
        for(int i = 0;i < test_case;i++)
        {
            int before_A = rs.nextInt();
            int before_B = rs.nextInt();
            int after_A = rs.nextInt();
            int after_B = rs.nextInt();
            if(before_A <= before_B && after_A <= after_B)
            {
                System.out.println("YES");
            }
            else if(before_A >= before_B && after_A >= after_B)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}