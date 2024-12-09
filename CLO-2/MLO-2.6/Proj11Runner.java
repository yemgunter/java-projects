public class Proj11Runner {

    public void run(Object[][] array) {

        System.out.println(
                "I certify that this program is my own work\n" +
                        "and is not the work of others. I agree not\n" +
                        "to share my solution with others.\n" +
                        "Yolanda Gunter\n"); // end Certification

        int count = 1; // start with 1

        // began loop for each row (lines 41-48 Proj11.java)
        for (int i = 0; i < array.length; i++) { // line 42

            // began loop for each column in those rows
            for (int j = 0; j < array[i].length; j++) { // line 43
                array[i][j] = count++; // line 44
            } // end loop for column
        } // end loop for row
    } // end method for array
} // end class
