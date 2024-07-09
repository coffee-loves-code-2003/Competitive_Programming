import java.util.*;
public class _1900_A
{
    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);
        int test_case  = rs.nextInt();
        for(int i = 0; i < test_case; i++)
        {
            int n = rs.nextInt();
            String input = rs.next();
            int max_consecutive_dots = 0;
            int consecutive_dots = 0;
            int total_dots = 0;
            int right = 0;
            while(right < n)
            {
                if(input.charAt(right) == '.')
                {
                    while(right < n && input.charAt(right)!= '#')
                    {
                        ++consecutive_dots;
                        ++total_dots;
                        ++right;
                    }
                    max_consecutive_dots = Math.max(max_consecutive_dots, consecutive_dots );
                    consecutive_dots = 0;
                }
                ++right;
            }
            if(max_consecutive_dots >= 3)
            {
                System.out.println(2);
            }
            else
            {
                System.out.println(total_dots);
            }

        }
    }
}