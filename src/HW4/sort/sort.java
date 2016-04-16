package HW4.sort;
import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
            int arr[] = {2,4,3,1,6,5};
            for(int i = 0 ; i < arr.length; i++) {
                for(int j = 0 ; j < i ; j++) {
                    if( arr[j] > arr[j+1] ) {
                        int tmp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = tmp;
                    }
                }
            }
        System.out.println(Arrays.toString(arr));
        }
    }
