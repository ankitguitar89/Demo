package FileReader;

public class readJson {
public static void main(String args[]) {
System.out.println("Inside main");	
method2();
readJson.method2();
}
public void method1() {System.out.println("Inside method1");
method2();}
public static void method2() {System.out.println("Inside method2");}
public void method3() {System.out.println("Inside method3");}
public void method4() {System.out.println("Inside method4");}
}
