package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_29_11 {

    private static int max(int[] arr){
        int maxElement = arr[0];
        int index = 0;

        for (int i = 0; i < arr.length; i++){
            if (maxElement <= arr[i]){
                maxElement = arr[i];
                index = i;            }
        }

        return index;
    }

    private static int max(double[] arr){
        double maxElement = arr[0];
        int index = 0;

        for (int i = 0; i < arr.length; i++){
            if (maxElement <= arr[i]){
                maxElement = arr[i];
                index = i;            }
        }

        return index;
    }

    private static double retMaxElement(double[] arr){
        double maxElement = arr[0];


        for (int i = 0; i < arr.length; i++) {
            if (maxElement <= arr[i]) {
                maxElement = arr[i];
            }
        }

        return maxElement;
    }

    private static int min(int[] arr){
        int maxElement = arr[0];
        int index = 0;

        for (int i = 0; i < arr.length; i++){
            if (maxElement >= arr[i]){
                maxElement = arr[i];
                index = i;            }
        }

        return index;
    }

    private static int[] FirstExAllPunkts(int[] arr1, int begin, int end){
        int[] arr = Arrays.copyOf(arr1, arr1.length );
        int[] arrCopy = new int[end - begin ];
        int k = 0;

        for (int i = end - 1; i >= begin ; i--) {
            arrCopy[k] = arr[i];
            k++;
        }

        k = 0;
        for (int i = begin; i < end ; i++){
            arr[i] = arrCopy[k];
            k++;
        }

       return arr;
    }

    public static void ex1(){
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 25, 14, 15};


        System.out.println("a) замена: ");

        for (int n: FirstExAllPunkts(arr, 2, 10)){
            System.out.print(n + " ");
        }

        int k = scanner.nextInt();
        int s = scanner.nextInt();
        s++;

        System.out.println("б) замена K и S: ");

        for (int n: FirstExAllPunkts(arr, k, s)){
            System.out.print(n + " ");
        }
        System.out.println();

        int indexMax = max(arr);
        int indexMin = min(arr);

        System.out.println("в) замена MAX и MIN");

        for (int n: FirstExAllPunkts(arr, Math.min(indexMin, indexMax), Math.max(indexMax, indexMin)) ){
            System.out.print(n + " ");
        }
    }

    public static void ex2() {
        int[] arr = new int[]{1, -2, 3, 4, -9, 3, 2, 30};
        int negativeIndex = 0;
        int positiveIndex = 0;

        boolean isFirsNegative = false;
        boolean isFirstPositive = false;
        System.out.println("ДО: ");


        for (int n: arr){
            System.out.print(n + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 0 && !isFirsNegative){
                negativeIndex = i;
                isFirsNegative = true;
            }
            else {
                positiveIndex = i;
                isFirstPositive = true;
            }

            }
        if (isFirstPositive && isFirsNegative){
            int temp = arr[positiveIndex];
            arr[positiveIndex] = arr[negativeIndex];
            arr[negativeIndex] = temp;

        }
        System.out.println("После: ");
        for (int n: arr){
            System.out.print(n + " ");
        }

    }

    private static boolean isDouble(int[] arr, int num){
        int k = 0;
        for (int n: arr){
            if (n == num) k++;
        }

        if (k > 1 ){
            return true;
        }

        return false;
    }

    private static int[] createUniqArr(int[] arr, int newlenUniqArr){
        boolean isRepeat = false;
        int[] uniqArr = new int[newlenUniqArr];
        int index = 0;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if ( (arr[i] == arr[j]) && (i!=j) ){
                    isRepeat = true;
                    break;
                }
            }
            if (!isRepeat){
                uniqArr[index] = arr[i];
                index++;

            }
            isRepeat = false;
        }
        return uniqArr;
    }

    private static int getLenUniqArr(int[] arr){
        int lenUniqArr = 0;
        boolean isRepeat = false;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if ( (arr[i] == arr[j]) && (i!=j) ){
                    isRepeat = true;
                    break;
                }
            }
            if (!isRepeat){
                lenUniqArr++;
            }
            isRepeat = false;
        }
        return lenUniqArr;
    }

    private static int[] sortArr(int[] arr){
        int lenUniqArr = 0;
        boolean isRepeat = false;

        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] >= arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

    private static int[] createNoDoubleArr(int[] arr){

        int capacity = 0;

        boolean is0 = false;

        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] == arr[i + 1]){
                is0 = true;
            }
            if (is0){
                capacity++;
                is0 = false;

                while (true){
                    if ((i == arr.length - 1)) break;

                    if ( (arr[i] != arr[i + 1])){
                        break;
                    }
                    i++;
                }

            }
        }

        int[] retArr = new int[capacity];
        int index = 0;
        boolean is = false;

        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] == arr[i + 1]){
                is = true;
            }
            if (is){
                retArr[index] = arr[i];
                index++;
                is = false;

                while (true){
                    if ((i == arr.length - 1)) break;

                    if ( (arr[i] != arr[i + 1])){
                        break;
                    }
                    i++;
                }

            }
        }

        return retArr;
    }

    public static void ex3() {
        int[] arr = new int[]{ 1, 1, 2, 3, 2, 2, 2, 11};

        for (int n : arr) {
            System.out.print(n + " ");
        }

        boolean isRepeat = false;
        int lenUniqArr = getLenUniqArr(arr);

        int temp = 0;
        int tempI = 0;


        int index = 0;

        int[] uniqArr = Arrays.copyOf(createUniqArr(arr, lenUniqArr), lenUniqArr);

        System.out.println();



        boolean isOccurence = false;

        int[] arrDouble = new int[arr.length - lenUniqArr];
        int k = 0;

        boolean f = false;

        System.out.println("А) числа в последовательности по одному разу: ");

        for (int n: arr){
            if (! isDouble(arr, n) ) {System.out.print(n + " "); f = true;}
        }
        System.out.println();

        System.out.println("Б) Равные члены: ");

        for (int n : createNoDoubleArr(sortArr(arr)) ){
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.println("B) Уникальные элементы: ");

        for (int n : uniqArr) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.print("Г) кол-во повторяющихся чисел: " + createNoDoubleArr(sortArr(arr)).length);
        System.out.println();
        System.out.println("Е) Имеется ли пара совпадающих чисел: " + f);
    }

    public static void ex4(){
        double[][] twoArr = {{1, 22, 3, 4, 5, 1}, {1, 4, 99, 1, 99}};

        double retSum = 0;

        for (int i = 0; i < twoArr.length; i++ ){
            retSum+=retMaxElement(twoArr[i]);
        }

        System.out.println(retSum);
    }




    private static int getLenDigits(int n){
        int k = 0;
        while (n > 0){
            n/=10;
            k++;
        }
        return k;
    }


    public static void ex5(){
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int[] arr = new int[getLenDigits(num)];

        for (int i = 0; i < arr.length; i++){
            arr[i] = num % 10;
            num/=10;
        }

        for (int n: arr){
            System.out.print(n + " ");
        }
    }




    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();

        //ex4();
        ex5();
    }



}
