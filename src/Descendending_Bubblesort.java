
public class Descendending_Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,2,3,1,7,3,8};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]>a[i])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}

	}

}
