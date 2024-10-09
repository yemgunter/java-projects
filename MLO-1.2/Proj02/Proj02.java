public class Proj02 {

    private int sum;

    public Proj02(String[] args) {

        this.sum = 0;

        for (String arg : args) {
            int num = Integer.parseInt(arg);
            System.out.println(num);
            this.sum += num;
        } // end processing of user input
    }// end constructor

    public void displaySum() {
        System.out.println(this.sum);
    }// end display of sum

    public static void main(String[] args) {
        System.out.println("I certify that this program is my own work");
        System.out.println("and is not the work of others. I agree not");
        System.out.println("to share my solution with others.");
        System.out.println("Yolanda Gunter");

        Proj02 proj = new Proj02(args);

        proj.displaySum();
    }// end main controlling method
}// end class