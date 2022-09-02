
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int no=sc.nextInt();
	    int ld,count=0;
	    while(no!=0)
	    {
	     ld=no%10;
	     if(ld==0)
	     {
	         count++;
	     }
	     no=no/10;
	    }
		System.out.println(count);
	}
}
