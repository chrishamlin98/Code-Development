public static void main(String [] args) {
  int array [] = {1,2,3,4,5};
  changes(array);

  for (int y: array)
  System.out.println(y);

public static void changes(int pointer[]){
  for (int i = 0; i < pointer.length; i++)
    i[pointer] += 12;
}
}
