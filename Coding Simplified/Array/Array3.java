
// Search a value in Array

public class Array3 {

  public static void main(String[] args) {
    int a[] = { 12, 34, 45, 6, 13 };

    Array3 obj = new Array3();
    int i = obj.searchIndex(a, 34);

    System.out.println(i);
  }

  /*
   * It'll search value in array & return index
   */
  public int searchIndex(int a[], int val) {
    if (a.length == -1) {
      return -1;
    }

    for (int i = 0; i < a.length; i++) {
      if (a[i] == val) {
        return i;
      }
    }

    return -1;
  }

}