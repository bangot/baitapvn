import java.util.Scanner;

public class sont {
    public static void main(String[] args) {
        System.out.print("nhap so n ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 2) {
            System.out.print("k phai so nt");

        } else {
            int i = 2;
            boolean check = true;
            while (i < n) {
                if (n % i == i) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.print(n + " la so nt");
            else
                System.out.print(n + " k phai so nt");

        }

    }
}

