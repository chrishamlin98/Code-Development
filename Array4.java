public static void main(String[] args) {
  int array[] = {1,2,3,4,5};
  changes(array);

  for (int y; array)
    System.out.print(y);

  }
public static void changes(int x[]){
  for (int i = 0; i < x.length; i++)
    // I used int [i] instead of changes [i]
    //Also, it is not changes [i], but rather, x[i]
    x[i] += 4;
}

}
