import java.util.*;
public class _1971_B
{
    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);
        int test_Case = rs.nextInt();
        for(int i = 0;i < test_Case;i++)
        {
            String input = rs.next();
            int input_length = input.length();
            if(input_length == 1)
            {
                System.out.println("NO");
            }
            else
            {
                char temp = input.charAt(0);
                int flag = 0;
                for(int j = 1;j < input_length;j++)
                {
                    if(temp != input.charAt(j))
                    {
                        flag = j;
                        break;    
                    }
                }
                if(flag == 0)
                {
                    System.out.println("NO");
                }
                else
                {
                    System.out.println("YES");
                    StringBuilder result = new StringBuilder(input);
                    char temp1 = result.charAt(flag);
                    result.setCharAt(flag, temp);
                    result.setCharAt(0, temp1);
                    System.out.println(result.toString());
                }

            }
        }
    }
}