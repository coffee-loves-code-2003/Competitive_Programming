import java.util.*;
public class _1980_A {
    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);
        int test_case = rs.nextInt();
        for(int i = 0; i < test_case; i++)
        {
            int n = rs.nextInt();
            int m = rs.nextInt();
            int ht[] = new int[7];
            String input = rs.next();
            for(int j = 0; j < n; j++){
                ht[input.charAt(j) - 65]++;

            }
            // for(int idx = 0;idx < 7;idx++)
            // {
            //     System.out.println(ht[idx]);
            // }
            // System.out.println();
            int count = 0;
            for(int chars = 0; chars < 7; chars++)
            {
                if(ht[chars] >=m)
                {
                    continue;
                }
                else
                {
                    count += (m - ht[chars]);
                }
                        
            }
            System.out.println(count);
        }
    }
}
