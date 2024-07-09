import java.util.*;
public class _1983_B
{
    public String getOutput(char[][] a,char[][] b,int n,int m)
    {
        for(int i = 0;i < n-1;i++)
        {
            for(int j = 0;j < m-1;j++)
            {
                int difference = ((b[i][j] - a[i][j])+ 3) % 3 ;
                if(difference == 1)
                {
                    a[i][j] = (char)(((a[i][j] - '0' + 1)%3)+ '0');
                    a[i+1][j+1] = (char)(((a[i+1][j+1] - '0' + 1)%3)+ '0');
                    a[i][j+1] = (char)(((a[i][j+1] - '0' + 2)%3)+ '0');
                    a[i+1][j] = (char)(((a[i+1][j] - '0' + 2)%3)+ '0');
                }
                else if(difference == 2)
                {
                    a[i][j] = (char)(((a[i][j] - '0' + 2)%3)+ '0');
                    a[i+1][j+1] = (char)(((a[i+1][j+1] - '0' + 2)%3)+ '0');
                    a[i][j+1] = (char)(((a[i][j+1] - '0' + 1)%3)+ '0');
                    a[i+1][j] = (char)(((a[i+1][j] - '0' + 1)%3)+ '0');
                }
            }
        }
        for(int i = 0;i < n;i++)
        {
            for(int j = 0;j < m;j++)
            {

                if(a[i][j] != b[i][j])
                {
                    return "NO";
                }
                // System.out.print(a[i][j]+" ");
            }
            // System.out.println();
        }
        return "YES";
    }
    public static void main(String[] args)
    {
        _1983_B obj = new _1983_B();
        Scanner rs = new Scanner(System.in);
        int test_case = rs.nextInt();
        for(int i = 0;i < test_case;i++)
        {
            int n  = rs.nextInt();
            int m  = rs.nextInt();
            char a[][] = new char[n][m];
            char b[][] = new char[n][m];
            List<String> input1 = new ArrayList<>();
            List<String> input2 = new ArrayList<>();
            for(int i1 = 0;i1 < n;i1++)
            {
                String temp = rs.next();
                input1.add(temp);
            }
            for(int i1 = 0;i1 < n;i1++)
            {
                String temp = rs.next();
                input2.add(temp);
            }
            for(int n1 = 0; n1 < n;n1++)
            {
                for(int m1 = 0;m1 < m;m1++)
                {
                    a[n1][m1]  = input1.get(n1).charAt(m1);
                }
            }
            for(int n1 = 0; n1 < n;n1++)
            {
                for(int m1 = 0;m1 < m;m1++)
                {
                    b[n1][m1]  = input2.get(n1).charAt(m1);
                }
            }
            System.out.println(obj.getOutput(a,b,n,m));
        }
    }
}