import java.util.Random;

public class Main {
    public static void main(String[] args) 
    {
        int[] randomArray = generateRandomArray(10, 0, 100);
        TestSuite.run(randomArray, 1000);
    }
    public static int[] generateRandomArray(int size, int min, int max) 
    {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) 
        {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }
}