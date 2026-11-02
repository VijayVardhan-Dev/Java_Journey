public class MultipleCatches {
    public static void main(String[] args){
        int arr[] = {1};
        try {
            int a = args.length;
            arr[20] = 99;
            int b = 10 / a;
        } catch (ArithmeticException  e) {
            System.out.println("Divisoin error: " + e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of index: " + e);
        }
    }
}