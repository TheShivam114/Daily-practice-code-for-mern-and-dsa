public class polymorphism_overloading {
    public static void main(String[] args){
          calculate s1=new calculate();
          System.out.println(s1.sum(5,4));
          System.out.println(s1.sum(5,6,4));
          System.out.println(s1.sum((float)5,(float)6));
    }
}
class calculate{
  int  sum (int a,int b){
    return a+b;
  }
  int sum(int a,int b,int c){
    return a+b+c;
  }
  float sum(float a, float b){
    return a+b;
  }
}
