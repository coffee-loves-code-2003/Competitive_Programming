import java.util.*;
public class _1992_B {
    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);
        int test_case = rs.nextInt();
        for(int i = 0;i < test_case;i++)
        {
            int n = rs.nextInt();
            int k = rs.nextInt();
            int arr[] = new int[k];
            for(int j = 0;j < k;j++)
            {
                arr[j] = rs.nextInt();
            }
            Arrays.sort(arr);
            int ones_count = 0;
            int operation = 0;
            for(int j = 0;j < k-1;j++)
            {
                operation+=arr[j] - 1;
                if(arr[j] == 1)
                {
                    ones_count += 1;
                }
                else
                {
                    ones_count += arr[j];

                }
            }
            operation+=ones_count;
            System.out.println(operation);
        }
    }
}
