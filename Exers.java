import java.util.Scanner;
import java.lang.Math;

public class Exers{
	public static void ex1(){
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		System.out.println(sc1.nextInt() + sc2.nextInt());
	}

	public static void ex2(){
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		

		System.out.println(sc1.nextDouble() == sc2.nextDouble());
	}

	public static void ex3(){
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		Double n1 = sc1.nextDouble();
		Double n2 = sc2.nextDouble();

		if (n1 <= n2) n1 = (double) 0;

		System.out.println(n1);
		System.out.println(n2);
	}

	public static void ex4(){
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);


		Double n1 = sc1.nextDouble();
		Double n2 = sc2.nextDouble();
		Double n3 = sc3.nextDouble();

		if (n1 > 0) n1*=n1;
		if (n2 > 0) n2*=n2;
		if (n3 > 0) n3*=n3;

		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);

	}

	public static void ex5(){
		int k = 0;
		int r;

		Scanner	scanner = new Scanner(System.in);
		int x = scanner.nextInt();

		while (x > 0){
			r = x%10;
			k+=r;
			x/=10;
		}

		System.out.println(k);
	}

	public static void ex6(){
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);


		Double n1 = sc1.nextDouble();
		Double n2 = sc2.nextDouble();
		Double n3 = sc3.nextDouble();

		for (int i = 1; i <= 3; i++){
			if (n1 == i) System.out.println(n1);
			if (n2 == i) System.out.println(n2);
			if (n3 == i) System.out.println(n3);
			
		}

	}

	public static void ex7(){
		Scanner sc1 = new Scanner(System.in);
		Double n1 = sc1.nextDouble();

		for (int i = 1; i <= 9; i++){
			System.out.println(n1 + " " + "*" + i + "=" + (i*n1));
		}
		
	}

	public static void ex8(){
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		Scanner sc4 = new Scanner(System.in);



		Double n1 = sc1.nextDouble();
		Double n2 = sc2.nextDouble();
		Double n3 = sc3.nextDouble();
		Double n4 = sc4.nextDouble();

		if (n1 <= n2 && n2 <= n3 && n3 <= n4){
			n1 = n4;
			n2 = n4;
			n3 = n4;

			System.out.println(n1 + " " + n2 + " " + n3 + " " + n4);
		}

		else if (n1 > n2 && n2 > n3 && n3 > n4){
			System.out.println(n1 + " " + n2 + " " + n3 + " " + n4);
		}
		else{
			n1*=n1;
			n2*=n2;
			n3*=n3;
			n4*=n4;
			System.out.println(n1 + " " + n2 + " " + n3 + " " + n4);
		}
	}

	private	static double max(double[] array){
		double max = array[0];

		for (int i = 1; i < array.length; i++) {
    		if (array[i] > max) {
      			max = array[i];
    		}
		}
	return max;
	}

	private	static double min(double[] array){
		double max = array[0];

		for (int i = 1; i < array.length; i++) {
    		if (array[i] < max) {
      			max = array[i];
    		}
		}
	return max;
	}

	public static void ex9(){
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);

		Double n1 = sc1.nextDouble();
		Double n2 = sc2.nextDouble();
		Double n3 = sc3.nextDouble();

		double max = max(new double[]{n1, n2, n3});
		double min = min(new double[]{n1, n2, n3});

		double	 med = (n1 + n2 + n3 - max - min);

		if (max < (med + min)){ System.out.println("треугольник");

				if (max*max < (med*med + min*min)){
					System.out.println("остроугольный треугольник");
				}
		}
	}

	public static void ex10(){
        Scanner sc = new Scanner(System.in);
        

        Double x = sc.nextDouble();
        Double y = sc.nextDouble();
        Double z = sc.nextDouble();

        if( (x + y < 1) && (x + z < 1) && (y + z < 1) ){
            if ((x < y) && (y < z)) x = (y + z)/2;
            else if ((y < x) && (y < z)) y = (z + x) / 2;
            else if ((z < y) && (z < x)) z = (y + x) / 2;
        }

        else {
            if (x < y){x = (y + z) / 2; }
            else if (y < x) y = (x + z) / 2;
        }

        System.out.println("X Y Z");
        System.out.println(x + " " + y + " " + z);
    }

    public static void ex11(){
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double x1, x2;
        double D_sqrt;

        if ( (b*b - 4 * a * c) >= 0){
            D_sqrt = Math.pow( (double) (b*b - 4 * a * c) , 0.5);
            //System.out.println(D_sqrt);

            if (  D_sqrt == 0){
                x1 = (-1 * b) / (2*a);

                System.out.println("x1 = x2 = " + x1);

            }
            else{
                x1 = ( (-1 * b) + D_sqrt) / (2*a) ;
                x2 = ( (-1 * b) - D_sqrt) / (2*a);

                System.out.println("x1: " + x1);
                System.out.println("x2: " + x2);
            }
        }
    }

	public static void ex12(){
	        Scanner scanner = new Scanner(System.in);
	        int num = scanner.nextInt();

	        int lenNum = 0;

	        int retNum = 0;

	        while (num > 0){
	            int razryd = num % 2;

	            retNum += (Math.pow(10, lenNum) * razryd);
	            num/=2;
	            lenNum++;
	        }

	        System.out.println(retNum);

	    }

	public static void ex13(){
		Scanner scanner = new Scanner(System.in);
		int a1, a2;

		while (true){
			a1 = scanner.nextInt();
			a2 = scanner.nextInt();

			if (a2 < a1) break;
		}
	}

	public static void main(String[] args){
		

		ex13();
	}
}