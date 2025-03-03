package LogicalCode;

public class MaxNum {
	 public static void main(String[] args) {
		int arr[]= {10, 800, 78, 90, 1, 14};
		int max = arr[0];
		
		for(int num : arr) {
			if (num>max) {
				
				max=num;
			}
			
		}
		System.out.println("Maximun Number= " +max);
		}
	 
}
