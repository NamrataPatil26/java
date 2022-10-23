package Assiment3Array;

public class LargestNumber9 {
		static void max(int arr[]) {
			//int count=0;
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(max < arr[i]) {//23<34
			//	count++;
				
				max=arr[i];//34,54,65
			}
		}
				System.out.println("largest no. of array is:"+max);
				//System.out.println("count:"+count++);
		}
			
		
		public static void main(String[] args) {
			int a[]= {23,34,54,65,37};
	         LargestNumber9.max(a);
	}

}
