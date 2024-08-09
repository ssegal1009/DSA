public class quiSort {
    /**
     * Quick Sort! it's recursive..
     * moves smaller elements to the left of a pivot. 
     * recursively divides array in 2 partitions
     * 
     * Best case: O(n log n)
     * Avg case: O(nlogn)
     * Worst case O (n^2) if already sorted
     * 
     * space complexity: O(logn) due to recursion
     * @param args
     */
    public static void main(String[] args) {
        int[] array = {8,2,5,3,9,4,7,6,1};


        quickSort(array, 0, array.length-1);


        for(int i: array){
            System.out.print(i + " ");
        }
    }

    private static void quickSort(int[] array, int start, int end){
        if(end <= start) return;//base case for recursion!
        int pivot = partition(array, start, end);//finds out where our pivot is so we can pass each sub array in recursively
        quickSort(array, start, pivot-1);//left partition
        quickSort(array, pivot+1, end);
    }
    private static int partition(int[] array, int start, int end){

        int pivot = array[end];
        int i = start-1; //starts before start of array, 0

        for(int j = start; j< end-1; j++){
            if(array[j] < pivot){//if one of these elements is less than our pivot, we want it on the left side of our pivot
                i++;
                int temp = array[i]; // basic variable swap
                array[i] = array[j];
                array[j] = temp;

            }
        }
        //once we land at the pivot, insert it into its final resting place
        i++;
        int temp = array[i]; // basic variable swap
        array[i] = array[end];
        array[end] = temp;


        return i;
    }
}
