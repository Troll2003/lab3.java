package labs3;
import java.util.Scanner;

public class program5 {
    
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String val = sc.nextLine();
			    String val2 = sc.nextLine();
			    char for_delete = val2.charAt(0);
			    char[] digits =  val.toCharArray();
			    String res="";
			    for(char c : digits){
			        if(c != for_delete){
			            res+=c;

}
			        
}
			    System.out.println(res);
		}
		}
	}
