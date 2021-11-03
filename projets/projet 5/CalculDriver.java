/*Youssef Mroue
26-5-2021
un programme qui peut calculer l'aire d'un rectangle et qui crash lorsque les valeur donner son negatives*/ 
import java.util.Scanner;

public class CalculDriver {

	public static void main(String[] args) {
//scanner for the object file 
		Scanner sc= new Scanner(System.in);
//interacting with the user
		System.out.println("please enter the width:");
		int width= sc.nextInt();
        if (width <= 0) { 
            System.exit(0); 
        }else {} 

		System.out.println("please enter the length:");
		int length= sc.nextInt();
        if (length <= 0){
            System.exit(0);
        } else {}
//returning the values  	
		Calcul o = new Calcul(width, length);
		System.out.println(o.toString()+o.area());		
	}
}