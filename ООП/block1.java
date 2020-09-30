import java.util.*;

public class block1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер задания: ");
        String zadanie = sc.nextLine();
        switch (zadanie) {
            case "1" :
                System.out.println("Остаток x:" + "\s" + number1(sc));
                break;
            case "2" :
                System.out.println("Площадь треугольника: " + number2(sc));
                break;
            case "3" :
                System.out.println("Общее количество ног: " + number3(sc));
                break;
            case "4":
                System.out.println("Результат: " + number4(sc));
                break;
            case "5":
                System.out.println(number5(sc));
                break;
            case "6":
                System.out.println("ASCII код: " + number6(sc));
                break;
            case "7":
                System.out.println("Сумма чисел от 1 до введенного числа: " + number7(sc));
                break;
            case "8":
                System.out.println("Максимальная третья сторона: " + number8(sc));
                break;
            case "9":
                System.out.println(number9(sc));
                break;
            case "10":
                if (number10(sc) == true)
                    System.out.println("Делится");
                else
                    System.out.println("Не делится");
                break;
        }
        sc.close();
    }
    public static int number1(Scanner sc){
        System.out.println("В первом задании нужно найти остаток от деления");
        System.out.println("Введите число a:");
        int a = sc.nextInt();
        System.out.println("Введите число b:");
        int b = sc.nextInt();
        int x = a%b;
        return x;
    }
    public static int number2(Scanner sc){
        System.out.println("В этом задании необходимо найти площадь треугольника");
        System.out.println("Введите число a:");
        int a = sc.nextInt();
        System.out.println("Введите число b:");
        int b = sc.nextInt();
        int x = a*b/2;
        return x;
    }
    public static int number3(Scanner sc){
        int chickens = 2;
        int cows = 4;
        int pigs = 4;
        System.out.println("Введите количество куриц: ");
        int numchick = sc.nextInt();
        System.out.println("Введите количество коров: ");
        int numcows = sc.nextInt();
        System.out.println("Введите количество свиней: ");
        int numpigs = sc.nextInt();
        int x = chickens*numchick+cows*numcows+pigs*numpigs;
        return x;
    }
    public static boolean number4(Scanner sc){
        System.out.println("Введите первое число");
        int num1 = sc.nextInt();
        System.out.println("Введите второе число");
        int num2 = sc.nextInt();
        System.out.println("Введите третье число");
        int num3 = sc.nextInt();
        if (num1*num2 > num3)
            return true;
        else
            return false;
    }
    public static String number5(Scanner sc){
        System.out.println("Введите первое число");
        int num1 = sc.nextInt();
        System.out.println("Введите второе число");
        int num2 = sc.nextInt();
        System.out.println("Введите третье число");
        int num3 = sc.nextInt();
        if (num1+num2==num3){
            String x = "Нужно сложить";
            return x;
        }
        else if (num1*num2==num3){
            String x = "Нужно умножить";
            return x;
        }
        else if (num1-num2==num3){
            String x = "Нужно вычесть";
            return x;
        }
        else{
            String x = "Ничего нельзя сделать";
            return x;
        }
    }
    public static int number6(Scanner sc){
        System.out.println("Введите символ: ");
        char slovo = sc.next().charAt(0);
        int x = (char) slovo;
        return x;
    }
    public static int number7(Scanner sc){
        int rez = 0;
        System.out.println("Введите число:");
        int num = sc.nextInt();
        for (int i=1; i<num+1; i++) {
            rez += i;
        }
        return rez;
    }
    public static int number8(Scanner sc){
        System.out.println("Введите первую сторону:");
        int num1 = sc.nextInt();
        System.out.println("Введите вторую сторону:");
        int num2 = sc.nextInt();
        int x = num1 + num2 - 1;
        return x;
    }
    public static int number9(Scanner sc){
        System.out.println("Введите количество элементов массива, и введите массив");
        int size = sc.nextInt();
        int array[] = new int[size];
        int sum = 0;
        for (int counter = 0; counter < size; counter++) {
            array[counter] = sc.nextInt();
        }
        for (int counter = 0; counter < size; counter++) {
            sum += Math.pow(array[counter], 3);
        }
        return sum;
    }
    public static boolean number10(Scanner sc){
        System.out.println("Введите первое число");
        int num1 = sc.nextInt();
        System.out.println("Введите второе число");
        int num2 = sc.nextInt();
        System.out.println("Введите третье число");
        int num3 = sc.nextInt();
        for (int i = 1; i < num2; i++ ){
            num1 += num1;
        }
        if (num1%num3 == 0)
            return true;
        else
            return false;
    }
}
