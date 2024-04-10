import java.io.*;
public class bytearrayinputstream{
public static void main(String args[]){
byte[] buf = {88, 66, 69, 99, 55};
ByteArrayInputStream barray=new ByteArrayInputStream(buf);
int b=0;
while((b = barray.read()) != -1){
char ch =(char)b;
System.out.println("char : " + ch);
}
}
}
