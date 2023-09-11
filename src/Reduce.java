public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int counter = 0;

        while (n != 0){
            boolean iseven = n % 2 == 0;
            if (iseven){
                n = n / 2;
                counter++;
            }
            else{
                n = n - 1;
                counter++;
            }
        }
        System.out.println("The amount of steps to reach 0 is: " + counter);
    }
}
