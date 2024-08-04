import java.io.*;
public class Fibonacci{
	public static void main(String[] args)throws Exception{
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("\n\nFibonacci series with in array:");
	System.out.println("Enter the count");
	int count=Integer.parseInt(bf.readLine());
	int i=0,num1=0,num2=1,sum=0;
	System.out.println(" "+num1+" "+num2);
	for(i=3;i<=count;i++)
	{
	sum=num1+num2;
	num1=num2;
	num2=sum;
	System.out.println(" "+sum);
	}
	if(count==i){
	System.out.println("\n_ _ _ _");
	}
     }
  }

