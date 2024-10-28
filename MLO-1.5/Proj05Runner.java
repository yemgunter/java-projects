/* File Proj05Runner

**************************************************************/

class Proj05Runner {

    // Method to process the String certification and add my name
    static String runA(String str) {
        str = str + "Yolanda Gunter\n";
        return str;
    }

    // Method to process the StringBuffer and add my name
    static StringBuffer runB(StringBuffer strBuf) {
        strBuf.append(" Yolanda Gunter");
        return strBuf;
    }
}// end class Proj05Runner