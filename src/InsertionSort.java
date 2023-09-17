public class InsertionSort {
    int[] array = {6, 9, 8, 3, 0, 1, 2, 4};
    public void insertionSorting(){
        for(int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i - 1;

            while (j>=0 && array[j] > temp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
        for (int i = 0; i < array.length; i ++){
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSorting();
    }
}
