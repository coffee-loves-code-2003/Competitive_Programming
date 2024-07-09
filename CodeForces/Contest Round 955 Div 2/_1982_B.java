import java.util.*;
public class _1982_B {
    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);
        int test_case = rs.nextInt();
        for(int i = 0;i < test_case;i++){
            int x = rs.nextInt();
            int y = rs.nextInt();
            int k = rs.nextInt();
            while(k>0)
            {
                x+=1;
                while(x%y==0)
                {
                    x/=y;
                }
                --k;
            }
            System.out.println(x);
        }
    }
}
