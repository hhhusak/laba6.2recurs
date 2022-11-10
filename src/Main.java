import java.util.Scanner;

public class Main {

    static void arrayCrRecurs(int[] a, int n, int min, int max, int i){
        if(i < n) {
            a[i] = (int) (Math.random() * (max - min)) + min;
            arrayCrRecurs(a, n, min, max, i + 1);
        }
    }

    static void printRecurs(int[] a, int n, int i){
        if (i < n){
            System.out.printf("%d\t", a[i]);
            printRecurs(a, n, i + 1);
        } else {
            System.out.println();
        }
    }

    static void taskRecurs(int[] a, int n, int i, double count, double sum){
        if(i < n){
            if(a[i] % 2 != 0){
                count++;
                sum += a[i];
            }
            taskRecurs(a, n, i + 1, count, sum);
        } else {
            System.out.printf("Середнє арифметичне: %.2f", sum / count);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Кількість елементів: ");int n = scan.nextInt();
        System.out.print("Мінімальне число: ");int min = scan.nextInt();
        System.out.print("Максимальне число: ");int max = scan.nextInt();
        int[] a = new int[n];

        arrayCrRecurs(a, n, min, max, 0);
        printRecurs(a, n, 0);
        taskRecurs(a, n, 0, 0,0);
    }
}