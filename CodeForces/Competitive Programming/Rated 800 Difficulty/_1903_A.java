import java.util.*;
public class _1903_A
{
    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);
        int test_case = rs.nextInt();
        for(int i = 0; i < test_case; i++)
        {
            int n = rs.nextInt();
            int k = rs.nextInt();
            int arr[] = new int[n];
            boolean isSorted = false;
            int flag = 0;
            int previous_number = Integer.MIN_VALUE;
            for(int idx = 0;idx < n;idx++)
            {
                arr[idx] = rs.nextInt();
                if(previous_number <= arr[idx] && flag == 0)
                {
                    isSorted = true;
                    previous_number = arr[idx];
                }
                else{
                    isSorted = false;
                    ++flag;
                }
            }
            if(k == 1 && n == 1)
            {
                System.out.println("YES");
            }
            else if(k == 1 && isSorted)
            {
                System.out.println("YES");
            }
            else if(k >= 2 )
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