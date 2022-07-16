import java.io.*;
import java.util.*;
class insertionsort
    {
        public void main()
        {
            int size;
            Scanner sc = new Scanner(System.in);
            System.out.println("please enter the size of array");
            size = sc.nextInt();
            int i,j;
            int arr[] = new int [size];
            System.out.println("please enter the elements in the array");
            for(  i =0;i<size;i++)
            {
                arr[i] = sc.nextInt();
            }
            int temp = 0;
            for( i = 1; i<size;i++)
            {
                int key = arr[i];
                  j = i - 1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
            
            
            for( i =0 ; i<size;i++)
            {
                System.out.println(arr[i]);
            }
        }
    }