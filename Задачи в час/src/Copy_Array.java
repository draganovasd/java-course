public class Copy_Array {
	public static void main(String[] args) {
		int[] test = { 1,2,3,4,5 };
		
		for(int i : test){
			System.out.print(i+ "");
		}
		
		int[] copyTest=new int[test.length];
		
		for(int i=0;i<=test.length;i++){
			copyTest[i]=test[i];
		}
		for(int i: copyTest){
			System.out.print(i+  " ");
		}
		
		
	
	}
	
}
