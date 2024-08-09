public class bubbSort {
    /** BUBBLE SORT
     * goes thru pair by pair in an array. checks which one is "lighter" - swaps as needed, storing one in int temp
     * O(n^2) -- the larger the dataset, the more inefficient. still pretty inefficient for smaller datasets.
     * @param args
     */
    public static void main(String[] args) {
        int array[] = {9,1,8,2,7,3,6,4,5};

        bubbleSort(array);



        for(int i: array){
            System.out.print(i);
        }
    }

    public static void bubbleSort(int array[]){
        for(int i = 0; i < array.length -1; i++){
            for(int j = 0; j <array.length- i -1; j++){
                if(array[j] > array [j+1]){//if you needed to sort in descending order, swap greater than w less than
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }

            }
        }

    }
    
}
