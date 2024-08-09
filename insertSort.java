public class insertSort {
    /**
     * insertion sort - after comparing elements to the left, shift elements to the right to make room to insert a value. 
     * 
     * O(n^2) quadratic time
     * small data set - decent
     * large data set - bad
     * 
     * less steps than bubble sort
     * best case is O(n) compared to selection sort
     * @param args
     */
    public static void main(String[] args) {

        int array[] = {9,1,8,2,7,3,6,5,4};

        insertionSort(array);

        for(int i : array)
        {
            System.out.print(i + " ");
        }        
    }

    private static void insertionSort(int array[]){
        for(int i = 1; i < array.length; i++){
            int temp = array[i];

            int j = i-1;//keeps track of what value we are comparing to the elft of whatever i is

            while(j>= 0 && array[j] > temp){
                array[j+1] = array[j];//shifts an element to the right
                j--;
            }
            array[j+1] = temp;

        }
    }
}
