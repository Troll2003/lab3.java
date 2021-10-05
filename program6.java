package labs3;

import java.util.Scanner;

public class program6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        for(int i=2;i<=a;i++){
            boolean b = true;
            for(int j=2;j<i;j++){
                if(i%j==0)
                {
                    b = false;
                    break;
                }
            }
            if(b)
            {
                System.out.println(i);
            }
        }

	}

}
