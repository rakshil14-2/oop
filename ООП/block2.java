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
                System.out.println(number3(sc));
                break;
            case "4":
                number4(sc);
                break;
            case "5":
                System.out.println(number5(sc));
                break;
            case "6":
                System.out.println(number6(sc));
                break;
            case "7":
                System.out.println(number7(sc));
                break;
            case "8":
                System.out.println(number8(sc));
                break;
            case "9":
                System.out.println(number9(sc));
                break;
            case "10":
                System.out.println(number10(sc));
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
    public static boolean number3(Scanner sc){
        boolean b;
        double a = 0;
        System.out.println("Введите количество чисел: ");
        int num = sc.nextInt();
        int array[]=new int[num];
        System.out.println("И их массив: ");
        for (int i = 0; i<num; i++){
            array[i] = sc.nextInt();
        }
        for (int i = 0; i<num; i++){
            a += array[i];
        }
        a /= num;
        if (a == (int) a)
            b = true;
        else
            b = false;
        return b;
    }
    public static int[] number4(Scanner sc){
        int a = 0;
        System.out.println("Введите количество чисел: ");
        int num = sc.nextInt();
        int array[]=new int[num];
        System.out.println("И их массив: ");
        for (int i = 0; i<num; i++){
            array[i] = sc.nextInt();
        }
        for (int i=1; i<num; i++){
            array[i]=array[i-1]+array[i];
        }
        System.out.print("[");
        for (int i = 0; i<num; i++){
            if (i == num-1)
                System.out.print(array[i]);
            else
                System.out.print(array[i] + ", ");
        }
        System.out.print("]");
        return array;
    }
    public static int number5(Scanner sc){
        int sum=0;
        System.out.println("Введите число: ");
        double d = sc.nextDouble();
        while (d%1!=0){
            d=d*10;
            sum+=1;
        }
        return sum;
    }
    public static int number6(Scanner sc) {
        System.out.print("Введите число: ");
        int x = sc.nextInt();
        int a = 1;
        int b = 1;
        int sum;
        for (int i = 0; i < x; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return a;
    }
    public static boolean number7(Scanner sc){
        System.out.println("Введите индекс");
        String index=sc.nextLine();
        return index.matches("\\d{5}");
    }
    public static boolean number8(Scanner sc){
        System.out.println("Введите 2 строки: ");
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        boolean x;
        if (str1.charAt(0)==str2.charAt(str2.length()-1)){
            if (str2.charAt(0)==str1.charAt(str1.length()-1)){
                x=true;
            }
            else
                x=false;
        }
        else
            x=false;
        return x;
    }
    public static boolean number9(Scanner sc) {
        System.out.println("Введите 3 строки: ");
        String str = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();
        boolean x = false;
        switch (str3) {
            case "prefix":
                x=str.startsWith(str2);
                break;
            case "suffix":
                x=str.endsWith(str2);
                break;
        }
        return x;
    }
    public static double number10(Scanner sc){
        System.out.println("Введите число: ");
        double x = sc.nextDouble();
        double y;
        if (x%2==0){
            y=x;
        }
        else {
            y = x + 2;
        }
        return y;
    }
}
