import java.util.*;
public class block2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер задания: ");
        String zadanie = sc.nextLine();
        switch (zadanie){
            case "1":
                System.out.println(number1(sc));
                break;
            case "2":
                System.out.println(number2(sc));
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            case "6":
                break;
            case "7":
                break;
            case "8":
                break;
        }
    }
    public static String number1(Scanner sc){
        System.out.println("Введите строку");
        String a = sc.nextLine();
        System.out.println("Введите количество повторений символов");
        int num = sc.nextInt();
        StringBuilder rez=new StringBuilder();
        char[] stringArray=a.toCharArray();
        for(int i = 0; i<a.length(); i++){
            rez.append(String.valueOf(stringArray[i]).repeat(Math.max(0,num)));
        }
        return rez.toString();
    }
    public static int number2(Scanner sc){
        int a = 0;
        int b = 2147483647;
        System.out.println("Введите количество чисел: ");
        int num = sc.nextInt();
        int array[]=new int[num];
        System.out.println("И их массив: ");
        for (int i = 0; i<num; i++){
            array[i] = sc.nextInt();
        }
        for (int i = 0; i<num; i++){
            if (a<array[i])
                a = array[i];
        }
        for (int i = 0; i<num; i++){
            if (b>array[i])
                b = array[i];
        }
        int x = a-b;
        return x;
    }
}