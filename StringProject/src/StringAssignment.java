public class StringAssignment {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum = sum + a[i];
		}
		double avg = sum/a.length;
		System.out.println(avg);
	}
}
