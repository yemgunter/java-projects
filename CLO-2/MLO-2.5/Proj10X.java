public interface Proj10X {

    default void printCertification() {
        System.out.println(
                "I certify that this program is my own work\n" +
                        "and is not the work of others. I agree not\n" +
                        "to share my solution with others.\n" +
                        "Yolanda\n" +
                        "Gunter");
    }// end printCertification

    int getData(); // Returns original randomData

    int getModifiedData(); // Returns modified data

}// end interface Proj10X
