// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class FinallyUses {

   public void method1() {
      try {
         int[] var10000 = new int[]{1};
         throw new RuntimeException("Demo");
      } finally {
         System.out.println("method 1 Finally is excuted");
      }
   }

   public void method2() {
      try {
         System.out.println("wil it print");
         return; 

      } finally {
         System.out.println("method 2 finally Executed");
      }

   }

   public void method3() {
      try {
         System.out.println("No error ");
      } finally {
         System.out.println("method 3 Finally executed anyways");
      }

   }

   public static void main(String[] var0) {
      FinallyUses var1 = new FinallyUses();

      try {
         var1.method1();
      } catch (Exception var3) {
         System.out.println(var3);
      }

      var1.method2();
      var1.method3();
   }
}
