import java.util.*;
public class _1901_A {
    public boolean can_make_it(int arr[], int fuel,int arr_length,int end_point)
    {
        int temp_fuel = fuel;
        for(int i = 1; i < arr_length; i++)
        {
            int distance = arr[i] - arr[i-1];
            if(temp_fuel - distance < 0)
            {
                return false;
            } 
        }
        int d_of_end_point_and_last_gas_station = end_point - arr[arr_length-1]; 
        temp_fuel -= d_of_end_point_and_last_gas_station;
        if(temp_fuel <= 0)
        {
            return false;
        }
        if(temp_fuel < d_of_end_point_and_last_gas_station)
        {
            return false;
        }
        return true;

    }
    public static void main(String[] args) {
        _1901_A obj = new _1901_A();
        Scanner rs = new Scanner(System.in);
        int test_case = rs.nextInt();
        for(int i = 0;i < test_case;i++)
        {
            int n = rs.nextInt(); // length of the array
            int x = rs.nextInt(); // endpoint
            int arr[] = new int[n];
            for(int idx = 0;idx < n;idx++)
            {
                arr[idx] = rs.nextInt();
            }
            int low = arr[0];
            int high = x+100;
            int ans = high;
            
                while(low <= high)
                {
                    int mid = (low + high)/2;
                    if(obj.can_make_it(arr,mid,n,x))
                    {
                        ans = mid;
                        high = mid - 1;
                    }
                    else
                    {
                        low = mid + 1;
                    }
                }
            
            
            System.out.println(ans);
        }
    }
}
