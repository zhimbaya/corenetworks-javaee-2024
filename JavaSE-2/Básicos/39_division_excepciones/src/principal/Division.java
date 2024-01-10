package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int s = a/b;
		System.out.println("La division es: " + s);
		} catch (InputMismatchException ex) {
			System.out.println("Número incorrecto: " );
		}
		catch (ArithmeticException ex) {
		System.out.println("Division por 0" );
		}
		catch (Exception ex) {
			//System.out.println("---" + ex);
			ex.printStackTrace();
		}
		finally {
			System.out.println("Fin del programa");
		}
	}

}
