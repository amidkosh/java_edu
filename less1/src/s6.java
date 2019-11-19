public class s6 {

	public static void main(String[] args) {
		System.out.println("Bla-Bla");

		char a = 'f';
		a = '\u0045';
		System.out.println(a);
		
		String s = "HEllo world";
		
		System.out.println(s.charAt(0));
//		System.exit(2323);
//		echo %ERRORLEVEL% - bash
		for (int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i)+"\n");
		}
		int f = 4;
		System.out.println(f);
		System.out.println("s6.main()");
	}

}
