import java.util.*;
public class _1981_A
{

    public static void main(String[] args) {
        _1981_A obj = new _1981_A();
        Scanner rs = new Scanner(System.in);
        int test_case = rs.nextInt();
        for(int i = 0;i < test_case;i++)
        {
            int l = rs.nextInt();
            int r = rs.nextInt();
            int result = 0;
            while(r > 1)
            {
                r/=2;
                ++result;
            }
            System.out.println(result);
        }
        rs.close();
    }
}