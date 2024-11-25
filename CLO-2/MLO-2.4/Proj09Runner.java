public class Proj09Runner {
    byte valA;

    public Proj09Runner(byte valA) {
        this.valA = valA;

        System.out.println("I certify that this program is my own work");
        System.out.println("and is not the work of others. I agree not");
        System.out.println("to share my solution with others.");
        System.out.println("Yolanda Gunter \n");
    }

    @Override
    public String toString() {
        return "Class Proj09Runner " + valA;
    } // end constructor
} // end class
