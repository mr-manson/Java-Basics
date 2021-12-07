package by.epamtc.nikalaichanka.task01;

import java.util.Scanner;

public class Task010301 {
	
	public static void task() {
		// 3.1. Напишите программу, где пользователь вводит любое целое положительное
		// число. А программа суммирует все числа от 1 до введенного пользователем
		// числа.
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(sum(a));
	}

	public static int sum(int a) {
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			sum += i;
		}
		return sum;
	}
}
