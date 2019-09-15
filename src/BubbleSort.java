
public class BubbleSort {

	public static void main(String[] args) {
		int intarray[]= {9,6,8,7,5};
		System.out.println("Before bubble sort elemnts");
		for(int i:intarray)
		{
			System.out.println(i);
		}
		bubbleSort(intarray);
		System.out.println("After bubble sort elemnts");
		for(int i:intarray)
		{
			System.out.println(i);
		}

	}

	private static void bubbleSort(int[] intarray) {
	int temp=0;
	for(int i=0;i<intarray.length-1;i++)
	{
		for(int j=1;j<(intarray.length);j++)
		{
			if(intarray[i]<intarray[j])
			{
				temp=intarray[i];	
				intarray[i]=intarray[j];
				intarray[j]=temp;
			}
		}
	}
		
	}

}
