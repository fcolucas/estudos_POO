public class Divisão {
    static int divide(int a, int b){
        return (a/b);
    }
    
    public static void main(String[] args) {
        int a = 3;
        int b = 0;
        try{
            divide(a, b);
        }
        catch(ArithmeticException e){
            System.out.println("Divisão impossivel por 0");
        }
    }  
}
