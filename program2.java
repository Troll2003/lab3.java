package labs3;

import java.util.Scanner;
import java.util.InputMismatchException;

public class program2 {
	
    
	public static void main(String[] args) throws InterruptedException{
		 Scanner scan = new Scanner(System.in);
	        System.out.println("Введіть 3  числа:");
	        float a = scan.nextFloat();
	        float b = scan.nextFloat();
	        float c = scan.nextFloat();
	        
	        a = Math.abs(a);
	        b = Math.abs(b);
	        c = Math.abs(c);
	        System.out.println(a + " "+ b+ " "+c);
	 
	        float tmp = Math.min(a,b);
	        float min = Math.min(tmp, c);
	        System.out.println("Найменше 2 число по модулю:\n" + min); 

	}
}


