import java.util.Random;

public class DemoRandom{
  public static void main(String[]args){

    //here no seed is provided, so it uses the clock as a seed
    //this can be used to produce a random seed for a different Random object!
    Random rng = new Random();
    int a;
    int [] listy = new int [5];
    String str1 = "";
    String str2 = "";
    for (int i =  0; i < 5; i++) {
      listy[i] = rng.nextInt() % 1000;
    }

    for (int i = 0; i < listy.length; i++) {
      str1 += listy[i] + ", ";
    }
    str1 = str1.substring(0, str1.length() - 2);

    Sorts.selectionSort(listy);
    for (int i = 0; i < listy.length; i++) {
      str2 += listy[i] + ", ";
    }
    str2 = str2.substring(0, str2.length() - 2);

    System.out.println(str1);
    System.out.println(str2);

    int[] listy1 = {1, 1, -3, -4, 0};
    Sorts.selectionSort(listy1);
    str2 = "";
    for (int i = 0; i < listy1.length; i++) {
      str2 += listy1[i] + ", ";
    }
    str2 = str2.substring(0, str2.length() - 2);
    System.out.println(str2);
    //specified seed can be used to reproduce sequences
    // rng = new Random(100);//seed of 100 is stored.
    // for(int i =  0; i < 5; i++ ){
    //   System.out.println(rng.nextInt() % 1000);
    // }
  }
}
