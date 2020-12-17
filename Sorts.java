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
}
