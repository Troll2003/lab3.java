package labs3;
import java.util.Scanner;

public class program4 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  System.out.println("¬вед≥ть ц≥ле число");
	        int result=0, value = sc.nextInt();
	        for(int i=1;i<=value;i++){
	            result+=(i*(i+1)*2*i);
	        }
	        System.out.println("–езультат: " + result);
		

	}
}
