package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.User;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<User> set = new HashSet<>();

		System.out.println("Quantos alunos no curso A?");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int user = sc.nextInt();
			set.add(new User(user));
		}

		System.out.println("Quantos alunos no curso B?");
		int n1 = sc.nextInt();

		for (int i = 0; i < n1; i++) {
			int user = sc.nextInt();
			set.add(new User(user));

		}
		System.out.println("Quantos alunos no curso C?");
		int n2 = sc.nextInt();

		for (int i = 0; i < n2; i++) {
			int user = sc.nextInt();
			set.add(new User(user));

		}
		
		System.out.println("Total de alunos: " + set.size());
	}
}
