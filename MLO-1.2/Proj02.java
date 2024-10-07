
class Proj02 {
    public static void main(String[] args) {
        System.out.println("I certify that this program is my own work");
        System.out.println("and is not the work of others. I agree not");
        System.out.println("to share my solution with others.");
        System.out.println("Yolanda Gunter");

int num1, num2, num3, num4, result;

        for (args.length >= 4) {
            num1 = Integer.parseInt(args[0]);
            num2 = Integer.parseInt(args[1]);
            num3 = Integer.parseInt(args[2]);
            num4 = Integer.parseInt(args[3]);

            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
            System.out.println(num4);

            result = num1 + num2 + num3 + num4;

            System.out.println(result);
        } else {
            System.out.println("Error: Please provide exactly 4 integer arguments.");
        }

    }// end method
}// end class