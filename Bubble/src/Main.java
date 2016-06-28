import java.util.Arrays;

/**
 * Created by saim on 07/06/16.
 */
public class Main {
    public static void main(String[] args) {
        int[] numbers = {2,4,8,5,9,3,1,56,8};

        numbers = BubbleSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));

//        BubbleSort.sort(numbers);
//        for (int i=0; i<numbers.length; i++)
//            System.out.print(numbers[i]+" ");

    }


}
