import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите количество элементов в прогресси: ");
        int n = num.nextInt();

        for(int i = 0; i >= n * -5; i -= 5) {
            System.out.println(i);
        }

    }
}
