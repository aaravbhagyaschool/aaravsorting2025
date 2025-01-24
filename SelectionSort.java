public class SelectionSort implements Sorter 
{
    public void sort(int[] input) 
    {
        for (int i = 0; i < input.length - 1; i++) 
        {
            int a = i;
            for (int j = i + 1; j < input.length; j++) 
            {
                if (input[j] < input[a]) 
                {
                    a = j;
                }
            }
            if (a != i) 
            {
                int temp = input[a];
                input[a] = input[i];
                input[i] = temp;
            }
        }
    }
}