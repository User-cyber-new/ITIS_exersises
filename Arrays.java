import java.util.Random;
import java.util.Scanner;
import java.lang.Math;



public class Arrays{

	public static void ex1(){
		Scanner	scanner	= new Scanner(System.in);
		int ex = scanner.nextInt();

		switch (ex){
			case 1:
			case 2:
				System.out.println("Неудовлтворительно");
				break;
		
			case 3:
				System.out.println("Удовлетворительно");
				break;
		
			case 4:
				System.out.println("Хорошо");
				break;
			case 5:
				System.out.print("Отлично");
				break;		
		}
	}

	public	static void ex8(){

		Scanner scanner	= new Scanner(System.in);

		int k = 0;

		final int LEN_ARR = 10;

		int[] arr = new int[LEN_ARR];

		int enter;

		int sumArr = 0, lenArr = 0;

		while (k != LEN_ARR){
			enter = scanner.nextInt();
			arr[k] = enter;
			k++;
		}

		for (int n: arr){
			System.out.print(n + " ");
		}
		System.out.println();

		for (int i = 1; i < arr.length - 1; i++){
			if( (arr[i] > arr[i - 1]) && (arr[i] > arr[i + 1]) ){

				if (arr[i] % 2 == 0) System.out.print(arr[i] + " ");
			}
		}

	}

	public static void ex6(){
		Scanner	scanner = new Scanner(System.in);

		int m = scanner.nextInt();
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++){
			for (int j = 0; j < m; j++){
				System.out.print('1');
			}
			System.out.println();
		}
	}

	public static void ex7_2(){
		Scanner	scanner = new Scanner(System.in);

		int m = scanner.nextInt();
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++){
			for (int j = 0; j < m; j++){
				System.out.print('1');
			}
			System.out.println();
		}
	}

	public static void ex7(){
		Scanner	scanner	= new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		double z = scanner.nextDouble();		

	}

	private static char toUp(char c){
		char[] arrLow = ("qwertyuiopasdfghjklzxcvbnm").toCharArray();
		char[] arrUp = ("QWERTYUIOPASDFGHJKLZXCVBNM").toCharArray();

		for (int i = 0; i < arrLow.length; i++){
			if (arrLow[i] == c) return arrUp[i];
		}
		return '!';
	}

	public static void ex4(){
		

		String newWord = "";

		Scanner scanner = new Scanner(System.in);

		String enter = scanner.next();

		for (int i = 0; i < enter.length(); i++){
			newWord	+= toUp( (enter.toCharArray())[i] );
		}

		System.out.println(newWord);
	}

	public static void ex5(){
		Scanner	scanner	= new Scanner(System.in);

		int num = scanner.nextInt();

		System.out.println(12 - num);
	}

	public static void ex3(){
		Scanner	scanner = new Scanner(System.in);

		int num = scanner.nextInt();

		int numSwitch = scanner.nextInt();

		switch	(numSwitch){
			case 1:
				System.out.println(num * num);
				break;

			case 2:
				System.out.println(Math.pow(num, 0.5));
				break;

			case 3:
				System.out.println(Math.sin(num));
				break;

			case 4:
				System.out.println(Math.cos(num));
				break;
		}
	}

	public static void ex11(){
		Scanner scanner	= new Scanner(System.in);

		int k = 0;

		final int LEN_ARR = 10;

		int[] arr = new int[LEN_ARR];


		while (k != LEN_ARR){
			
			arr[k] = scanner.nextInt();
			k++;
		}

		int proizved = 1;

		for (int n: arr){
			if (n % 7 == 0) proizved*=n;
		}

		System.out.println(proizved);


	}

	public static void ex2(){
		Scanner	scanner	= new Scanner(System.in);

		int time = scanner.nextInt();

		if (time >= 5 && time < 10){
			System.out.println("Доброе утро");
		}
		else if (time >=10 && time <= 15){
			System.out.println("Добрый день");
		}
		else if (time > 15 && time < 21){
			System.out.println("Добрый вечер");
		}

		if ( (time	>= 0 && time <5) || (time > 21 && time <= 24) ){
			System.out.println("Доброй ночи");
		}
	}

	public static void ex12_A(){
		Scanner	scanner	= new Scanner(System.in);

		int x = scanner.nextInt();

		double result;

		if( (x >= -2) && (x < 2) ){
			result = (double)x*x;		
		}
		else {result = 4;}

		System.out.println(result);
	}

	public static void ex12_B(){
		Scanner	scanner	= new Scanner(System.in);

		int x = scanner.nextInt();

		int result;

		if( (x <= 2) ){
			result = x*x + 4*x + 5;		
		}
		else {result = ((x*x + 4*x + 5) );}

		System.out.println(1 + " / " + result);

		double newResult = 1 / (double)result;	

		System.out.println(newResult);
	} 


	public static void ex9(){

		Scanner scanner	= new Scanner(System.in);

		int k = 0;

		final int LEN_ARR = 10;

		int[] arr = new int[LEN_ARR];

		int enter;

		int sumArr = 0, lenArr = 0;

		while (k != LEN_ARR){
			enter = scanner.nextInt();
			arr[k] = enter;
			k++;
		}

		for (int n: arr){
			if (n % 5 == 0 && n % 7 != 0){
					lenArr++;
					sumArr+=n;

			}
		}

	System.out.println("Сумма" + sumArr + " колл-во" + lenArr);
	}

	public static void ex10(){
		Scanner scanner	= new Scanner(System.in);

		int k = 0;

		final int LEN_ARR = 10;

		int[] arr = new int[LEN_ARR];

		int sumArr = 0;

		while (k != LEN_ARR){
			
			arr[k] = scanner.nextInt();
			k++;
		}

		for (int n: arr){
			if (n > 0) sumArr+=n;
		}

		System.out.println(sumArr*2);
	}

	public static void ex14(){
		Scanner scanner	= new Scanner(System.in);

		int k = 0;

		final int LEN_ARR = 10;

		int[] arr = new int[LEN_ARR];

		while (k != LEN_ARR){
			
			arr[k] = scanner.nextInt();
			k++;
		}

		System.out.print("номер который не добавится: ");

		int item = scanner.nextInt();

		double srArifm = 0;

		for (int i = 0; i < arr.length; i++){
			if (i != item){
				srArifm	+=arr[i];
			}
		}

		srArifm /= (arr.length - 1);

		System.out.print(srArifm);
	}

	private static double myPow(double x, int n) {
        if (n > 0) {
            if (n == 1) return x;
            return x * myPow(x, n - 1);
        }
        else if(n < 0){
            if (n == -1) return (1/x);
            return (0.5) * myPow(x, n+1);
        }
        return 1.0;
    }

    public static void ex13_A(){
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        int n = scanner.nextInt();

        System.out.println(myPow(a, n));
    }

    public static void ex13_B(){ // Буква Б
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int n = scanner.nextInt();

        int sumResul = 0;
        int proizved = a;

        for (int i = 1; i < n; i++){
            a++;
            proizved *= a;

            sumResul += proizved;
        }

        System.out.println(sumResul);
    }

    public static void ex13_C(){  // буква В
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        int n = scanner.nextInt();

        double denominator = 1;
        double sumResult = 0;

        for (int i = 0; i <= n; i++){
            denominator*= (1/(a));

            a++;

            sumResult += denominator;
        }

        System.out.println(sumResult);
    }


	public static void main(String[] args){
		
		ex13_B();
		}
	}
