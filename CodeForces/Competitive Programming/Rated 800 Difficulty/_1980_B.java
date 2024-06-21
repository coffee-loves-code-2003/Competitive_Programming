import java.util.*;

public class _1980_B {
    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return b - a;
            }
        };

        Scanner rs = new Scanner(System.in);
        int test_case = rs.nextInt();

        for(int i = 0; i < test_case; i++) {
            int n = rs.nextInt();
            int f = rs.nextInt();
            int k = rs.nextInt();
            int arr[] = new int[n];

            for(int j = 0; j < n; j++) {
                arr[j] = rs.nextInt();
            }

            int his_favourite_element = arr[f - 1];

            Integer[] arrObj = Arrays.stream(arr).boxed().toArray(Integer[]::new);

            Arrays.sort(arrObj, comparator);
            // System.out.println(i);
            if (k == n) {
                System.out.println("YES");
            } else if (arrObj[k - 1] == his_favourite_element && arrObj[k] == his_favourite_element) {
                System.out.println("MAYBE");
            } else if (arrObj[k] >= his_favourite_element) {
                System.out.println("NO");
            } else if (arrObj[k] < his_favourite_element) {
                System.out.println("YES");
            }
        }
    }
}
