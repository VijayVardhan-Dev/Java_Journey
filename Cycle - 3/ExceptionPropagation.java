public class ExceptionPropagation {

    public void method3(){
        int a = 10 / 0;
        System.out.println("method 4 Excuted");
   }
       public void method2(){
        this.method3();
        System.out.println("method 2 Executed");
   }

   public void method1(){
        this.method2();
        System.out.println("method 1 Excuted");
   }
       
    public static void main(String[] args){
        ExceptionPropagation ep = new ExceptionPropagation();
    
            ep.method1();

    }
}
