public class Proj02 {
    public static void main(String[] args) {
        // Printing the certification statement
        System.out.println("I certify that this program is my own work");
        System.out.println("and is not the work of others. I agree not");
        System.out.println("to share my solution with others.");
        System.out.println("Yolanda Gunter");

        int sum = 0;

        for (String arg : args) {
            int num = Integer.parseInt(arg);

            System.out.println(num);

            sum += num;
        }

        System.out.println(sum);
    }// end method
}// end class