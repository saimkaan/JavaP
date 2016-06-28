/**
 * Created by saim on 07/06/16.
 */
public class BubbleSort {
    public static int[] sort(int[] numbers)
    {
        boolean sorted = false;
        int temp;

        while (!sorted) {
            sorted = true;
            for(int j = 0; j<numbers.length - 1; j++) {
                if(numbers[j]>numbers[j+1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                    sorted = false;
                }

            }
        }
        return numbers;

    }
}
