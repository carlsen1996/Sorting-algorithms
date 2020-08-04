public class SelectionSort {
    public static int[] selectionSort(int[] array) {
        int[] sortert = array;
        for (int i = 0; i < sortert.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < sortert.length; j++){
                if (sortert[j] < sortert[index]){
                    index = j;
                }
            }
            int mindre = sortert[index];
            sortert[index] = sortert[i];
            sortert[i] = mindre;
        }
        return sortert;
    }
}
