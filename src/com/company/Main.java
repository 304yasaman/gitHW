import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int a1 = sc.nextInt();
        int count = 0;

        for (int i=2;i<=n;i++) {
            int a2 = sc.nextInt();
            int aa = a2 - a1;
            if (aa!=0)
                count = count + 1;
            a1 = a2;

        }
        System.out.println(count);

    }
}


