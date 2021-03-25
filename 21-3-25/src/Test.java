////////class Person {
////////    static int count;
////////    int i;
////////}
////////public class Test {
////////    public static void main(String[] args) {
////////        Person p1=new Person();
////////        p1.i++;
////////        Person.count++;
////////        System.out.println(Person.count);
////////        Person p2=new Person();
////////        Person.count++;
////////        System.out.println(Person.count);
////////        System.out.println(p2.count);
////////    }
////////}
//////class Person {
//////    public void func2(){
//////        System.out.println("func2");
//////    }
//////    public static void fun3(){
//////        Person p1=new Person();
//////        p1.func2();
//////        Test t=new Test();
//////        t.func();
//////        Test.func4();
//////        String[] name={" sdaf","asfsaf"};
//////    }
//////}
//////public class Test {
//////    public void func() {
//////        System.out.println("func");
//////    }
//////    public static void func4(){
//////        System.out.println("func4");
//////    }
//////    public static void main(String[] args) {
//////        Test t=new Test();
//////        t.func();
//////        Person.fun3();
//////    }
//////}
////class Person {
////    private int a;
////    private String name;
////
////    public int getA() {
////        return a;
////    }
////
////    public void setA(int a) {
////        this.a = a;
////    }
////
////    public String getName() {
////        return name;
////    }
////
////    public void setName(String name) {
////        this.name = name;
////    }
////
////    public String toString(){
////        return name;
////    }
////    //    public void setA(int a){
//////        this.a =a;
//////    }
//////    public int getA() {
//////        return a;
//////    }
////}
////public class Test {
////    public static void main(String[] args) {
////        Person p1= new Person();
////        p1.setA(10);
////        p1.setName("name");
////        System.out.println(p1.getA());
////        System.out.println(p1);
////    }
////}
//class Person {
//    int a;
//    Person(){
//        System.out.println("Person");
//    }
//    Person(String name){
//        System.out.println(name);
//    }
//    {
//        System.out.println("实例代码" );
//    }
//    static {
//        System.out.println("静态代码");
//    }
//    public String toString (){
//        return a+"";
//    }
//
//}
//public class Test {
//    public static void main(String[] args) {
//        Person p1=new Person();
//        System.out.println(p1.a);
//        System.out.println(p1);
//    }
//}
class MyArrayList {
    int usedsize;
    int [] elem;
    static final int cap=10;
    public MyArrayList(){
        this.elem=new int[cap];
        this.usedsize=0;
    }
    public void push_back(int a){
        this.elem[usedsize]=a;
        this.usedsize++;
    }
    public void rush_back(){
        this.usedsize--;
    }
    public void add(int pos,int n){
        if(this.usedsize<pos-1){
            System.out.println("插入失败");
            return;
        }
        else{
            for(int i=this.usedsize;i>pos;i++){
                this.elem[i+1]
            }
        }
}
public class Test {
    public static void main(String[] args) {

    }
}