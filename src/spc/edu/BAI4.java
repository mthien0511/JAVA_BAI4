/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class BAI4 {
    public static void main(String[] args) {
        System.out.println("chuong trinh tinh hieu 2 so");
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so a");
        int a = sc.nextInt();
        System.out.println("nhap so b");
        int b = sc.nextInt();
        
    }
        public static int tinhtong(int a, int b) {
    return a + b;
}

public static int tinhhieu(int a, int b) {
    return a - b;
}

public static int tinhtich(int a, int b) {
    return a * b;
}

public static float tinhthuong(int a, int b) {
    return (float) a / b;
}

public static String TinhThuongMoi(int a, int b) {
    if (b == 0) return "Không thể chia cho 0!";
    return String.format("%.2f", (float) a / b);
 
    }
public static int tinhtong(int a, int b) { return a + b; }
public static int tinhhieu(int a, int b) { return a - b; }
public static int tinhtich(int a, int b) { return a * b; }
public static double tinhthuong(int a, int b) { return (double)a / b; }
public static String TinhThuongMoi(int a, int b) {
    if (b == 0) {
        return "Khong the chia cho 0";
    } else {
        return Double.toString((double)a / b);
        }
    }
}
