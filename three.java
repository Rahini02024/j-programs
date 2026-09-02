class Three{
//to add two numbers  -static method with void return no value
 void add(int a, int b){
System.out.println(a + b);
}
 int add1(int a,int b){
     return a + b;
}

public static void main(String[] ar){

Three t1 = new three();    // t1 is object ref variable
 t1.add(12,23);
 t1.add(1,2);
  int sum = t1.add1(10,20);

  System.out.println("Sum is: " + sum); 

}