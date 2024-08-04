import java.io.*;
import java.lang.Math;
class calc{
int count(int num){
int count=0;
while(num!=0){
count++;
num=num/10;
}
return count;
}
void calc(int start,int end){
int i,j;
for(i=start;i<end;i++){
int sum=0;
int a=i,b=i;
while(a>0){
j=a%10;
sum+=(Math.pow(j, count(i)));
a=a/10;}
if(sum==b){
System.out.println(sum);
}}}}
public class Armstrong{
public static void main(String[] args)throws Exception{
calc c=new calc();
BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the range:");
int start=Integer.parseInt(bf.readLine());
System.out.println("End");
int end=Integer.parseInt(bf.readLine());
System.out.println("Armstrong numbers are:");
c.calc(start,end);
}}
