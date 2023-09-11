public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int divisible = 0;

        while (i < 1000) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 && divisibleBy5) {

                divisible++;

            } else if (divisibleBy3) {

                divisible++;

            } else if (divisibleBy5) {

                divisible++;

            }
            i++;
        }

        System.out.println("Multiples of 3 or 5 below 1000: " + divisible);

    }
}
