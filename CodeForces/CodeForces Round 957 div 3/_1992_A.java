import java.util.*;
public class _1992_A
{
    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);
        int test_case = rs.nextInt();
        for(int i = 0; i < test_case; i++) {
            int a = rs.nextInt();
            int b = rs.nextInt();
            int c = rs.nextInt();
            int max = a * b * c;
            for(int da = 0; da <= 5; da++) {
                for(int db = 0; da + db <= 5; db++) {
                    int dc = 5 - da - db;
                    max = Math.max(max, (a + da) * (b + db) * (c + dc));
                }
            }
            System.out.println(max);
        }
    }
}
