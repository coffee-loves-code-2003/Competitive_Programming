import java.util.*;
public class _1989_A
{
    public static void main(String[] args)
    {
        Scanner rs = new Scanner(System.in);
        int points = rs.nextInt();
        int coordinates[][] = new int[points][2];
        for(int i = 0;i < points;i++)
        {
            coordinates[i][0] = rs.nextInt();
            coordinates[i][1] = rs.nextInt();
            if(coordinates[i][1] < -1)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
            }
        }
    }
}