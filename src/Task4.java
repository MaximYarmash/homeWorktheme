public class Task4 {
    public static void main(String... arg){
        int a = 347;
        int firstA = a / 100;
        int secondA = a / 10 % 10;
        int thirdA = a % 10;
        int sum = firstA + secondA + thirdA;
            System.out.println("Sum a=" + sum);
    }
}
