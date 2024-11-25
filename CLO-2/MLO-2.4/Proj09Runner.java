public class Proj09Runner extends Object {
    byte valA; // Instance variable to store byte value

    public Proj09Runner(byte valA) { // Construtor initalizing value
        this.valA = valA; // Save value into the instance value

        System.out.println("I certify that this program is my own work");
        System.out.println("and is not the work of others. I agree not");
        System.out.println("to share my solution with others.");
        System.out.println("Yolanda Gunter \n");
    }

    public String toString() { // Overriding toString method
        return "Class Proj09Runner " + valA; // Return string
    } // end constructor
} // end class
