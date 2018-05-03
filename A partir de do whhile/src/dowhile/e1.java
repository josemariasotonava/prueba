package dowhile;

import java.util.Random;
import java.util.Scanner;

public class e1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aleatorio = 0;
		Random rd = new Random();
		Scanner sc = new Scanner(System.in );
		int n = Integer.parseInt(sc.nextLine());
		do {
			aleatorio = rd.nextInt(100);
		}
		while (aleatorio%3 != 0);
		
		System.out.println(aleatorio);
		sc.close();
		{	
		}
		}
	}