class throwthrows1
{
void div(int a, int b)
{
if(b==0)
{
throw new ArithmeticException();
}
else {
int c=a/b;
System.out.println(c);
}}
public static void main(String args[])
{
throwthrows1 m=new throwthrows1();
try{
m.div(20,5);
}catch(ArithmeticException e)
{
System.out.println("The value of 'B' is zero");
}
}
}