package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import model.entities.User;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Set<User> set = new TreeSet<>();
		
		System.out.print("Enter file full path: ");
		String path = scan.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(" ");
				set.add(new User(fields[0], Instant.parse(fields[1])));
				line = br.readLine();
			}

		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
		}

		System.out.println();
		System.out.println("Input file: ");
		int sum = 0;
		for (User user : set) {
			System.out.println(user);
			sum++;
		}
		
		System.out.println();
		System.out.println("Total users: " + sum);
		
		scan.close();
	}

}
