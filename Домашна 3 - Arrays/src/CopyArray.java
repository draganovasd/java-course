import java.util.Arrays;
public class CopyArray {

	public static void main(String[] args) {
		int[] a = new int[]{1,2,3,4,5};
		int[] b = a.clone();
		System.out.println("Array A= " + Arrays.toString(a));
		System.out.print("Array B= " + Arrays.toString(b));
	}

}
