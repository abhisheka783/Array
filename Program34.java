//smallest # in an array using Arrays.sort(a)
import java.util.Arrays;
class Program34
{
	public static void main(String[] args) 
	{
		int[] a={10,32,30,52,41,10,9,5};
		for(int i:a)
			System.out.print(i+" ");
		System.out.println();
		Arrays.sort(a);
		System.out.println(a[0]+" is a smallest number");
	}
}
