package labs3;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
	
		try (Scanner sc = new Scanner(System.in)) {
			int i = 2;
			System.out.print("������ ���� �����: ");
			if(sc.hasNextInt()) { // ������� ������ ���� � ������ �������� ����� ������� ���� �����
				
				i = sc.nextInt(); // ������ ���� ����� � ������ �������� � �������� � �����
				if (i%2 == 0){// ����� �� ��� � �������,���� ������ ������� ���� �� ����� �����
		            System.out.println("�����" + " " + i + " " + "�����");
		          } else {
		          System.out.println("�� ����� �� ����� �����");
		        }
				
			} else {
				System.out.println("�� ����� �� ���� �����");
			}
		}

			
			
		}

	}


