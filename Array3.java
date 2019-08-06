public static void main(String[] args) {
  int[] array = {1,2,3,4,5};
  change(array);

//I keep forgetting what the 2nd term in the enhanced loop is
// also I forgot to include the "int" before the y
  for (int y, array)
    System.out.print(y);

  public static void change(int x[]){
    for (int i = 0; i < x.length; i++)
      //now I'm pausing at this point
      //I keep trying to put x for the change and I need to put
      //the i, since it is pointing to the new array
      //Also, it is x[i], not change[i]
      x[i] += 10;
  }


}
