import java.util.Scanner;

public class MyProgram {


	public static void ex3(){
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		String enter;

		while(!scanner.hasNextInt()){
			enter = scanner.next();
    	}

    	num = scanner.nextInt();

    	if (num >=0 && num <=59){
    		System.out.println("неудовлетворительно");
    	}
    	else if (num >=60 && num <=74){
    		System.out.println("удовлетворительно");
    	}
    	else if (num >=75 && num <=89){
    		System.out.println("хорошо");
    	}
    	else if (num >=90 && num <=100){
    		System.out.println("отлично");
    	}
    	

	}

	public static void ex1(){
		for (int i = 0; i < 100 + 1; i++){
			System.out.println(i);
		}
	}

	public static void ex2(){

		Scanner scanner = new Scanner(System.in);
		int num = 0;
		String enter;

		while(!scanner.hasNextInt()){
			enter = scanner.next();
    	}

    	num = scanner.nextInt();

		int k = 1;

		while (num > 0){
			k*=num;
			num--;
		}

		System.out.println(k);
	}

	public static void ex4(){
		for (int i = 1; i < 20 + 1; i++){
			if (i % 2 == 0) System.out.print(i + " ");
		}

		System.out.println();

		for (int i = 1; i < 20 + 1; i++){
			if (i % 2 != 0) System.out.print(i + " ");
		}
	}

    public static void main(String args[]) {
    	ex2();
    	System.out.println();
    	ex4();
    	
	}
}
