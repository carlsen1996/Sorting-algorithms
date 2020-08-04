import java.util.*;

public class MergeSort {
  static int[] mergeSort(int[] array, int storrelse) {
    int[] sortert = array;
    if (storrelse > 1) {
      int mid = storrelse / 2;
      int[] first = Arrays.copyOfRange(sortert, 0, mid);
      first = mergeSort(first, mid);
      int[] second = Arrays.copyOfRange(sortert, mid, storrelse);
      second = mergeSort(second, storrelse - mid);
      sortert = mergeArrays(first, second, mid, storrelse - mid);
    }
    return sortert;
  }

  static int[] mergeArrays(int[] first, int[] second, int storrelse, int mid) {
    int[] sortert2 = new int[storrelse + mid];
    int i = 0, f = 0, s = 0;
    while (f < storrelse && s < mid) {
      if (first[f] < second[s]) {
        sortert2[i++] = first[f++];
      }
      else {
        sortert2[i++] = second[s++];
      }
    }
    while (f < storrelse)
      sortert2[i++] = first[f++];
    while (s < mid)
      sortert2[i++] = second[s++];
    return sortert2;
  }
}
