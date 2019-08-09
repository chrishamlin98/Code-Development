public static void main(String[]args) {
  int[] data = {2, 4, 6, 8, 10};
  changes(data);

  for (int y:data)
    System.out.println(y);

  }
public static void changes(int[] input) {
  for (int counter = 0; counter < input.length; counter++){
    input[counter] += 10;
  }

}

}
//1st time I actually got it correct on the first time

// So basically, I created some data
//Then set the loop to move through all of the data in an array
//Then I call the input array variable and use the counter loop to complete
//the function.

//then in the main class I used an enhanced for loop to print out the results
