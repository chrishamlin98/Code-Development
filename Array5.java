public static void main(String [] args) {
  int data [] = {1,2,3,4,5};
  changes(data);

  for (int y: data)
  System.out.println(y);
}

public static void changes(int input[]){
  for (int pointer = 0; pointer < input.length; pointer++)
  //1 mistake - it's not pointer[input], but rather input[pointer].
    input[pointer] += 12;
}
}
