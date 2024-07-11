import java.util.*;
public class _1971_C {
    public void swap(int arr[])
    {
        if(arr[0] > arr[1])
        {
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
    }
    public static void main(String[] args)
    {
        _1971_C obj = new _1971_C();
        Scanner rs = new Scanner(System.in);
        int test_Case = rs.nextInt();
        for(int i = 0;i < test_Case;i++)
        {
            int a[] = new int[2];
            int b[] = new int[2];
            for(int j = 0;j < 2;j++)
            {
                a[j] = rs.nextInt();
            }
            for(int j = 0;j < 2;j++)
            {
                b[j] = rs.nextInt();
            }
            obj.swap(a);
            obj.swap(b);
            if(a[0] < b[0] && b[0] < a[1] && a[0] < b[1] && b[1] < a[1])
            {
                System.out.println("NO");
            }
            else if(b[0] < a[0] && a[0] < b[1] && b[0] < a[1] && a[1] < b[1])
            {
                System.out.println("NO");
            }
            else if(b[0] < a[0] && a[0] < b[1] || b[0] < a[1] && a[1] < b[1])
            {
                System.out.println("YES");
            }
            else if(a[0] < b[0] && b[0] < a[1] || a[0] < b[1] && b[1] < a[1])
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
