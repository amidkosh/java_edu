package less1.src;

import java.util.Arrays;

import less2.Door;
public class Pudge {

	public static void main(String[] args) {
		Door door = new Door();
		func5();
//		func4();
		
		
		
//		func2();
//		func1();
//		func3();
	}

	private static void func5() {
		String as = "Hello world!";
		System.out.println(as.lastIndexOf("l"));
		System.out.println(as.substring(7));
		
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		System.out.println(str1.equals(str3));
	}

	private static void func4() {
		int[][] res = new int[(int)(Math.random()*3 + 3)][];
//		System.out.println(Arrays.deepToString(res));
		for(int i=0;i<res.length;i++) {
			res[i] = new int[(int)(Math.random()*4 + 5)];
//			System.out.println(Arrays.toString(res[i]));
			for(int j=0;j<res[i].length;j++) {
//				System.out.println(j);
				res[i][j] = (int)(Math.random()*101);
			}
		}

//		System.out.println(Arrays.deepToString(res));
		for (int j =0;j<res.length;j++) {
			System.out.println(Arrays.toString(res[j]));
		}
	}

	private static void func3() {
		int[][] c = new int[3][];
		c[1] = new int[4];
		System.out.println(c[0]);
		System.out.println(Arrays.toString(c[1]));
		c[2] = new int[] {4,5,7};
		System.out.println(Arrays.toString(c[2]));
	}

	private static void func2() {
		int[] b = {1,1,1}; 
		int[] c = new int[9];
		
		System.out.println(c[1]);
//		System.out.println(g);
		System.out.println(Arrays.toString(b));
		System.arraycopy(b, 0, c, c.length/2 -b.length/2, b.length);
		System.out.println(Arrays.toString(c));
	}
	
	public static void func1() {
		int[] a = new int[5];
		a[0]= 6;
		int[] b = {3,5,7,8}; 
		int[] c = new int[3];
		int g;
		System.out.println(c[1]);
		//System.out.println(g);
		System.out.println(Arrays.toString(b));
		System.arraycopy(b, 0, c, 0, 3);
		System.out.println(Arrays.toString(c));
	}

}
