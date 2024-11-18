public class Proj08Runner {

    String run(String arg) {// run method one with certification message
        return "I certify that this program is my own work \n" +
                "and is not the work of others. I agree not \n" +
                "to share my solution with others.\n" +
                "Yolanda Gunter \n";// replaced with my name
    }// end method one

    String run(int num, String name) {// run method two with number and my name
        return num + "\n" + name;
    }// end method two

    byte run(int num) {// run method three converts int to byte
        return (byte) num;
    }// end method three

}// end class Proj08Runner