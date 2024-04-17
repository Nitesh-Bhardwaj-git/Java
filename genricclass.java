import java.util.Scanner;
public class genricclass<T>{
T t;
public void add(T t){
this.t = t;
}
public T get(){
return t;
}
public static void main(String[] args){
Scanner s=new Scanner(System.in);
genricclass<Integer> obj1 = new genricclass<Integer>();
genricclass<Double> obj2 = new genricclass<Double>();
genricclass<String> obj3 = new genricclass<String>();
System.out.prntln("Enter integer value: ");
m.add(s.nextInt());
System.out.prntln("Enter double value: ");
n.add(s.nextDouble());
System.out.prntln("Enter srting value: ");
s.nextLine();
o.add(s.nextLine());
System.out.println("\nThe output is: ")
System.out.println(m.get());
System.out.println(n.get());
System.out.println(o.get());
}
}