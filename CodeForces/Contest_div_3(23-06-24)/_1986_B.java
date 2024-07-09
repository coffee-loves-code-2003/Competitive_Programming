import java.util.*;
public class _1986_B
{
    public void compute(int i1, int j1,int mat[][],int m,int n)
    {
        int result= mat[i1][j1];
        int up = Integer.MIN_VALUE;
        int left = Integer.MIN_VALUE;
        int right = Integer.MIN_VALUE;
        int down = Integer.MIN_VALUE;
        //up
        if(i1 > 0)
        {
            up = mat[i1-1][j1];
        }
        //left
        if(j1 > 0 )
        {
            left = mat[i1][j1-1];
        }
        //right
        if(j1 < n-1)
        {
            right =mat[i1][j1+1];

        }
        //down
        if(i1 < mat.length-1)
        {
            down = mat[i1+1][j1];
        }
         if (result > up && result > down && result > right && result > left)
         {
            mat[i1][j1] = Math.max(up,Math.max(down,Math.max(left,right)));
         }

    }
    public static void main(String[] args) {
        _1986_B obj = new _1986_B();
        Scanner rs = new Scanner(System.in);
        int test_case = rs.nextInt();
        for(int i = 0;i<test_case;i++)
        {
            int m = rs.nextInt();
            int n = rs.nextInt();
            int mat[][] = new int[m][n];
            for(int i1 = 0;i1<m;i1++)
            {
                for(int j1 = 0;j1<n;j1++)
                {
                    mat[i1][j1] = rs.nextInt();
                }
            }
            for(int i1 = 0;i1<m;i1++)
            {
                for(int j1= 0;j1<n;j1++)
                {
                obj.compute(i1, j1, mat, m, n);                   
                
                }
            }
            for(int i1 = 0;i1<m;i1++)
            {
                for(int j1= 0;j1<n;j1++)
                {
                    System.out.print(mat[i1][j1]+" ");
                }
                System.out.println();
            }
        }
    }
}