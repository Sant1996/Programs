
public class AdditionOf2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,4,6,7,8,5,6,2};
		int[] b= {3,5,6,9,3,1};
		int l1 = a.length;
		if(a.length<b.length)
		{
			l1=b.length;
		}
		for(int i=0;i<l1;i++)
		{
			try {
				System.out.print(a[i]+b[i]+" ");
			} catch (Exception e) {
				// TODO: handle exception
				if(a.length<b.length)
				{
					System.out.print(b[i]+" ");
				}
				else
				{
					System.out.print(a[i]+" ");
				}
			}
		}

	}

}
