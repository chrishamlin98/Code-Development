
public class Array3 {

	public static void main(String[] args) {
		int [] array = {1,2,3,4,5};
		Change(array);

		for (int y:array)
			System.out.print(y + " ");
	}

	public static void Change(int x[]) {
		for (int i = 0; i < x.length; i++) {
      // Keep forgetting this one part with the x[i]
			x[i] += 15;
		}
	}

}
