public class arrayPractice {

  public class static void main(String[] args) {
    int[] array = {1, 3, 5, 7, 11, 13};
    Changes(array);

    for (int y: array)
    // This is the part I messed up -
    // I put Changes(nums.y) and I put it in the wrong place;
      System.out.print(y);
  }
      // This is the part I messed up -
      // I put Changes(nums.y) and I put it in the wrong place;
  public static void Changes(int nums[]){
    // In the for loop I keep making the pointer connect
    // to the method and paramaters, but it is separate!
    // This is NOT correct for (int Changes = 0; Changes < nums.length; Changes++){
    for (int i = 0; i < nums.length; i++) {
    // This was also incorrect  Changes(x += 15);
    nums[i] += 15;
    }

  }

}
