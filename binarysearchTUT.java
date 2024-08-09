
/**
 * Binary Search alg
 * O(logn) because its more efficient the larger the dataset
 * 
 * finds the position of a vlue within a sorted array. half of the array is eliminated during each step.
 */
public class binarySearchTUT{
    public static void main(String[] args) {
        int array[] = new int[100];
        int target = 42; //very CS5

        for(int i = 0; i < array.length; i++){
            array[i] = i;
        }

        //int index = Arrays.binarySearch(array, target); built in arrays function, now lets build our own
        int index = binarySearch(array, target); //built in arrays function, now lets build our own

        if(index == -1){
            System.out.println("TARGET NOT FOUND");
        } else{
            System.out.println("ELEMENT FOUND AT: " + index);
        }
    }

    private static int binarySearch(int[] array, int target){

        int low = 0;
        int high = array.length -1;

        while(low<=high){
            int middle = low + (high - low) /2;
            int value = array[middle];
            System.out.println(value); // to count how many steps to find the value
            if(value < target){
                low = middle + 1;
            } else if(value> target){
                high = middle - 1;
            } else{
                return middle; //target is found!
            }

        }

        return -1;

    }
    
}
