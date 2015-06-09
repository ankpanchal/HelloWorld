import java.util.InputMismatchException;
import java.util.Scanner;


public class HelloWorld {

	public static void main(String[] args) {
		double productCode=0.00, quantity=0.00, price=0.00, total=0.00;
		// TODO Auto-generated method stub
		try{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter product code: ");
		productCode = sc.nextDouble();
		System.out.print("Enter price: ");
		price = sc.nextDouble();
		System.out.print("Enter quality: ");
		quantity = sc.nextDouble();
		

		total = price * quantity;
		}
		catch (Exception e){
			System.out.println("error message" +e.getMessage());
		}
		
		System.out.println();
		System.out.println(quantity + " " + productCode + " @" + price +  " = " + total);
		System.out.println();
		System.out.println();
	
		}

}
