import java.util.*;

class multiplicationtable
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
		int table=s.nextInt();
		int upto=s.nextInt();
		int value=0;
		
		for(int i=1;i<=upto;i++)
		{
			value=table*i;
			System.out.println(table+"*"+i+"="+value);
			
		}
}
}