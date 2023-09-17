public class CocktailSort {
    int[] array = {6, 9, 8, 3, 0, 1, 2, 4};

    public void cocktailSorting() {
        boolean swapped;
        int n = array.length;

        do {
            swapped = false;

            for (int i = 1; i < n; i++) { // Итерация вперед
                if (array[i - 1] > array[i]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }

            swapped = false;

            for (int i = n - 1; i > 0; i--) { // Итерация назад
                if (array[i - 1] > array[i]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }


    public static void main(String[] args) {
        CocktailSort cocktailSort = new CocktailSort();
        cocktailSort.cocktailSorting();
    }
}