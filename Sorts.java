public class Sorts {
  public static void bubbleSort (int[] data) {
    boolean noSwap = true;
    int temp = 0;
    int swapCounter = 0;
    String str2 = "";
    for (int i = 0; i < data.length; i++) {
      // for (int j = 0; j < data.length; j++) {
      //   str2 += data[j] + ", ";
      // }
      // str2 = str2.substring(0, str2.length() - 2);
      // System.out.println(str2);
      // str2 = "";
      noSwap = true;
      for (int j = 0; j < data.length - swapCounter - 1; j++) {
        if (data[j] > data[j + 1]) {
          temp = data[j + 1];
          data[j + 1] = data[j];
          data[j] = temp;
          noSwap = false;
        }
      }
      if (noSwap == true) {
        i = data.length;
      }
    }
  }

  public static void selectionSort (int[] data) {
    int temp = 0;
    int mini;
    int miniIndex;
    for (int i = 0; i < data.length; i++) {
      mini = data[i];
      miniIndex = i;
      for (int j = i; j < data.length; j++) {
        if (mini > data[j]) {
          mini = data[j];
          miniIndex = j;
        }
      }
      temp = data[i];
      data[i] = mini;
      data[miniIndex] = temp;
    }
  }

  public static void insertionSort (int[] data) {
    int temp = 0;
    int temp1 = 0;
    for (int i = 1; i < data.length; i++) {
      for (int j = i; j >= 0; j--) {
        if (data[i] > data[j]) {
          temp = data[j];
          data[j] = data[i];
          for (int k = j + 1; k <= i; k++) {
            temp1 = data[k];
            data[k] = temp;
            temp = temp1;
          }
          j = -1;
        }
        if (data[j] == data[i]) {
          j = -1;
        }
        if (j == 0) {
          temp = data[0];
          data[0] = data[i];
          for (int k = j + 1; k <= i; k++) {
            temp1 = data[k];
            data[k] = temp;
            temp = temp1;
          }
        }
      }
    }
  }
}
