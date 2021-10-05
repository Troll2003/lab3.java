package labs3;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
	
		try (Scanner sc = new Scanner(System.in)) {
			int i = 2;
			System.out.print("Введіть ціле число: ");
			if(sc.hasNextInt()) { // повертає істину якщо з потоку введення можна зчитати ціле число
				
				i = sc.nextInt(); // читаємо ціле число з потоку введення і зберігаємо в змінну
				if (i%2 == 0){// ділимо на два з остачею,якщо остача дорівнює нолю то число парне
		            System.out.println("Число" + " " + i + " " + "парне");
		          } else {
		          System.out.println("Ви ввели не парне число");
		        }
				
			} else {
				System.out.println("Ви ввели не ціле число");
			}
		}

			
			
		}

	}


