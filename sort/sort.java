package sort;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Игорь и Людмила on 15.03.2016.
 */
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
