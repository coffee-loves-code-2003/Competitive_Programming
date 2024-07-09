import java.util.*;
public class _1986_C {
    public String compute(String s,String c,int arr[],int length)
    {
        Set<Integer> index = new TreeSet<>();
        for(int i = 0;i<length;i++)
        {
            index.add(arr[i]);
        }
        char s1[] = s.toCharArray();
        char c1[] = c.toCharArray();
        Arrays.sort(c1);
        int ind = 0;
        for(int idx : index)
        {
            s1[idx - 1] = c1[ind];
            ++ind;
        }
        return new String(s1);
    }
    public static void main(String[] args) {
        _1986_C obj = new _1986_C();
        Scanner rs = new Scanner(System.in);
        int test_case = rs.nextInt();
        for(int i = 0;i<test_case;i++)
        {
            int s_length = rs.nextInt();
            int c_length = rs.nextInt();
            String s = rs.next();
            int arr[] = new int[c_length];
            for(int idx = 0;idx < c_length;idx++)
            {
                arr[idx] = rs.nextInt();
            }
            String c = rs.next();
            System.out.println(obj.compute(s,c,arr,c_length));
        }
    }
}
