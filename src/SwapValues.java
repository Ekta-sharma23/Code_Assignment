
public class SwapValues {

	public static void main(String[] args) {
		int i=10;
		int j=7;
		
		{
			//logic

			i=i+j;    //i = i + j: i now holds the sum of the original values of i and j.  10+7=17
			j=i-j;    //j = i - j: j now holds the original value of i.  				j=   17-7=10
			i=i-j;    //i = i - j: i now holds the original value of j.					i=   17-10=7
		} 
		
		System.out.println(i); // Output: 7
        System.out.println(j); // Output: 10
	}
}
