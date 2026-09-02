class Two{
//to add two numbers  -static method with void return no value

static void add(int a, int b){
System.out.println(a+b);
}
static int add1(int a,int b){
return a+b;
}

public static void main(String[] ar){
add(12,23);
Two.add(1,2);
  int sum=add(10,20);
System.out.println("Sum is:"+sum) 