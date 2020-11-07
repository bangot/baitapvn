package com.btct;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.print("nhap so n ");
        Scanner scanner=new Scanner(System.in);
	int n;
        n = scanner.nextInt();
        if (n%2!=0){
            System.out.print(n+" la  so le");
        }
else {
    System.out.print("nhap lai");
        }
    }
}
