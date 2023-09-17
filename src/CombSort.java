public class CombSort {
    int[] array = {6, 9, 8, 3, 0, 1, 2, 4};

    public void combSorting() {
        int gap = array.length;
        double shrinkFactor = 5;
        boolean swapped;

        do {
            gap = (int) (gap / shrinkFactor);
            if (gap < 1) {
                gap = 1;
            }
            swapped = false;
            for (int i = 0; i < array.length - gap; i++) {
                if (array[i] > array[i + gap]) {
                    int temp = array[i];
                    array[i] = array[i + gap];
                    array[i + gap] = temp;
                    swapped = true;
                }
            }
        } while (gap > 1 || swapped);

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        CombSort combSort = new CombSort();
        combSort.combSorting();
    }
}
