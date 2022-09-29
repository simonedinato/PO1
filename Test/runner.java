package Test;
public class runner {
    int x;
    //x.foo(x, x);
    public static void main(String[] args){
        System.out.println("Hello World");
    }    
    /* */
    public static int foo(int x, int y){
        //return (x > 0) ?  y :  x;
        return increment(x);
    }
    
    private static int increment(int i){
        return i + 1;
    }

}    

