public class selectSort {
    /**
     * selection sort - search thru an array and keep track of the minimum value during each iteration. at the end of the iteration, then swap variables.
     * O(n^2) - quadratic time
     * small data set is okay (bit better than bubble) but large is BAD
     * @param args
     */
    public static void main(String[] args) {

        int array[] = {8,7,9,2,3,1,5,4,6};


        selectionSort(array);

        for(int i : array){
            System.out.print(i);
        }
        
    }

    private static void selectionSort(int array[]){
        for(int i = 0; i <array.length -1; i++){
            int min = i; //current minimum val
            for(int j =i+1; j <array.length ; j++){//start j off one ahead of i so we dont swap into a min value we already placed

                if(array[min] > array[j]){//if our current min is actually bigger than array[j], then make the new minimum our current j
                    min = j;
                }

            } 

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;

        }
    }
    
}
