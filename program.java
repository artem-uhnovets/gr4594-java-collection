import java.util.Scanner;
public class program {
    public static void main(String[] args) {
        int count = 2;
        int value = switch (count) {
        case 1, 3, 5 -> 12;
        case 2, 4, 6 -> 52;
        default -> 0;
        };
        System.out.println(value);
    }
}