import java.util.*;

public class Oblig3 {
  public static void main(String[] args) {
    Random rand = new Random();

    //Selectionsort
    System.out.println("Selection sort");
    //Random
    int[] randArray1 = new int[1000];
    for (int i = 0; i < randArray1.length; i++) {
      randArray1[i] = rand.nextInt();
    }
    int storrelse = randArray1.length;
    SelectionSort sel = new SelectionSort();
    long t = System.nanoTime();
    int[] randSortert1 = sel.selectionSort(randArray1);
    double tid = (System.nanoTime() - t) / 1000000.0;
    System.out.println("Tilfeldig: " + tid);


    //Stigende
    t = System.nanoTime();
    int[] stigSortert1 = sel.selectionSort(randSortert1);
    tid = (System.nanoTime() - t) / 1000000.0;
    System.out.println("Stigende: " + tid);


    //reverser array
    int[] rev = new int[storrelse];
    int j = storrelse;
    for (int i = 0; i < storrelse; i++) {
      rev[j - 1] = randSortert1[i];
      j = j - 1;
    }
    //Synkende
    t = System.nanoTime();
    int[] synkSortert1 = sel.selectionSort(rev);
    tid = (System.nanoTime() - t) / 1000000.0;

    System.out.println("Synkende: " + tid);
    System.out.println("");


    //MergeSort
    System.out.println("Merge sort");
    //Random
    int[] randArray2 = new int[1000];
    for (int i = 0; i < randArray2.length; i++) {
      randArray2[i] = rand.nextInt();
    }
    storrelse = randArray2.length;
    MergeSort mer = new MergeSort();
    t = System.nanoTime();
    int[] randSortert2 = mer.mergeSort(randArray2, storrelse);
    tid = (System.nanoTime() - t) / 1000000.0;
    System.out.println("Tilfeldig: " + tid);


    //Stigende
    t = System.nanoTime();
    int[] stigSortert2 = mer.mergeSort(randArray2, storrelse);
    tid = (System.nanoTime() - t) / 1000000.0;
    System.out.println("Stigende: " + tid);

    //reverser array
    rev = new int[storrelse];
    j = storrelse;
    for (int i = 0; i < storrelse; i++) {
      rev[j - 1] = randSortert2[i];
      j = j - 1;
    }


    //Synkende
    t = System.nanoTime();
    int[] synkSortert2 = mer.mergeSort(rev, storrelse);
    tid = (System.nanoTime() - t) / 1000000.0;
    System.out.println("Synkende: " + tid);
    System.out.println();

    //
    //
    //
    // //QuickSort
    System.out.println("Quicksort");
    //Random
    int[] randArray3 = new int[1000];
    for (int i = 0; i < randArray3.length; i++) {
      randArray3[i] = rand.nextInt();
    }
    storrelse = randArray3.length;
    QuickSort qui = new QuickSort();
    t = System.nanoTime();
    qui.quickSort(randArray3, 0, storrelse - 1);
    tid = (System.nanoTime() - t) / 1000000.0;
    System.out.println("Tilfeldig: " + tid);

    //Stigende

    int[] midArray1 = new int[1000];
    for (int i = 0; i < midArray1.length; i++) {
      midArray1[i] = rand.nextInt();
    }
    Arrays.sort(midArray1);

    t = System.nanoTime();
    qui.quickSort(midArray1, 0, storrelse - 1);
    tid = (System.nanoTime() - t) / 1000000.0;
    System.out.println("Stigende: " + tid);


    //Synkende
    int[] midArray2 = new int[1000];
    for (int i = 0; i < midArray2.length; i++) {
      midArray1[i] = rand.nextInt();
    }
    Arrays.sort(midArray2);
    storrelse = midArray2.length;
    //reverser array
    rev = new int[storrelse];
    j = storrelse;
    for (int i = 0; i < storrelse; i++) {
      rev[j - 1] = midArray2[i];
      j = j - 1;
    }
    t = System.nanoTime();
    qui.quickSort(rev, 0, storrelse - 1);
    tid = (System.nanoTime() - t) / 1000000.0;
    System.out.println("Synkende: " + tid);
    System.out.println();

    //sortfunksjonen innebygd i java
    //Tilfeldig
    System.out.println("Arrays.sort()");
    int[] randArray4 = new int[1000];
    for (int i = 0; i < randArray4.length; i++) {
      randArray4[i] = rand.nextInt();
    }
    storrelse = randArray4.length;
    t = System.nanoTime();
    Arrays.sort(randArray4);
    tid = (System.nanoTime() - t) / 1000000.0;
    System.out.println("Tilfeldig: " + tid);

    //Stigende
    t = System.nanoTime();
    Arrays.sort(randArray4);
    tid = (System.nanoTime() - t) / 1000000.0;
    System.out.println("Stigende: " + tid);

    //Synkende
    int[] randArray5 = new int[1000];
    for (int i = 0; i < randArray5.length; i++) {
      randArray5[i] = rand.nextInt();
    }
    Arrays.sort(randArray5);
    storrelse = randArray5.length;
    //Reverser array
    rev = new int[storrelse];
    j = storrelse;
    for (int i = 0; i < storrelse; i++) {
      rev[j - 1] = randArray5[i];
      j = j - 1;
    }
    t = System.nanoTime();
    Arrays.sort(randArray5);
    tid = (System.nanoTime() - t) / 1000000.0;
    System.out.println("Synkende: " + tid);


  }
}
