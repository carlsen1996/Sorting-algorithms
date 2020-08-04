class QuickSort {
  public int partition(int[] array, int start, int slutt) {
    int pivot = array[slutt];
    int i = (start - 1);
    for (int j = start; j < slutt; j++) {
      if (array[j] < pivot) {
        i++;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }
    int temp = array[i + 1];
    array[i + 1] = array[slutt];
    array[slutt] = temp;
    return (i + 1);
  }

  void quickSort(int[] array, int start, int slutt) {
    if (start < slutt) {
      int p = partition(array, start, slutt);
      quickSort(array, start, p - 1);
      quickSort(array, p + 1, slutt);
    }
  }
}
