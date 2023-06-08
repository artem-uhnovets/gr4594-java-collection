import java.util.Scanner;

public class program {
    public static void main(String[] args) {
    int i = 123;
    { // начало внутренненго блока кода

        System.out.println(i);
        
    } // конец блока
    
    System.out.println(i); // error: cannot find symbol
    }
}