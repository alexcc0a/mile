package ru.netology;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите сумму купленного билета: ");
        Scanner scanner = new Scanner(System.in);
        int ticket = scanner.nextInt();
        int oneMile = 20;
        int bonus = ticket / oneMile;
        System.out.println("Вам начислены бонусы в размере: " + bonus + "р");
    }
}