
public class StringProject {

	public static void main(String[] args) {
		String s = "Hello World";

		// print only Hello with substring and split
		System.out.println(s.substring(0, 5));

		// get index of W and using charat and index
		System.out.println(s.indexOf('W'));
		System.out.println(s.charAt(6));

		// iterate and print each character
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			System.out.print(c);
		}
		System.out.println();
		// reverse string and print //dlroW olleH

		for (int j = s.length() - 1; j >= 0; j--) {
			char d = s.charAt(j);
			System.out.print(d);
		}
		System.out.println();

		// Op - Hello#World - instead of space using # without using //replace method
		int pos = 5;
		char replace = '#';
		String res = s.substring(0, pos) + replace + s.substring(pos + 1);
		System.out.println(res);

		// String s = "1a2b3c"; //Op - abbccc
		String s1 = "1a2b3c";
		StringBuffer s3 = new StringBuffer();
		for (int i = 0; i < s1.length(); i = i + 2) {
			char ch = s1.charAt(i + 1);
			int count = Character.getNumericValue(s1.charAt(i));
			// System.out.print(count); //123
			for (int j = 0; j < count; j++) {
				s3.append(ch);
			}
		}
		System.out.println(s3.toString());
	}
}
