/**
 * interpolation searchL improvement over binary search best used where data is "uniformly" distributed. it "guesses" where a value might be based on calculated probe results. if probe
 * is incorrect, search area is narrrowed, and a new probe is calculated
 * 
 * avg case: O(log(log(n)))
 * worst case: O(n) - value increases exponentially
 */
public class interpSearch {
    public static void main(String[] args) {
        
        int[] array = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};

        int index = interpolationSearch(array, 128);

        if(index != -1){
            System.out.println("Element found at:" + index);
        } else{
            System.out.println("Element not found");
        }


    }

    private static int interpolationSearch(int[] array, int value){
        int high = array.length -1;
        int low = 0;

        while(value >= array[low] && value <= array[high] && low <= high){

            int probe = low + (high-low)* (value - array[low])/ //interp search formula
                            (array[high]-array[low]);

            System.out.println("probe: " + probe);//print probe, our "guess" each time

            if(array[probe]==value){ //more of a smart search compared to binary search, checks if current probe is greater than or less than our target
                return probe;
            } else if(array[probe] <value){
                low = probe+1;

            } else{
                high = probe -1;
            }

        }

        return -1;
    }
}
