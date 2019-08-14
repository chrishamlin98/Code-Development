public class AddTo {

  public static void main(String []args) {
    Int [] data = {5, 10, 20, 30};
    change(data);

    for (int y:data)
      System.out.println(y);
  }
  public static void change(int []input) {
    for (int counter = 0; counter < input.length; counter++)
      input[counter] += 20;
  }

}
