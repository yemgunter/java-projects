public class Cow implements Animal {
    public String speak() { // implement speak method
        return "I am a cow.\nMy name is Bessie.";
    }

    public void sleep(String data) { // Implement sleep method
        System.out.println(data + ":Yawn");
    }

    public int run() { // run method
        return 0; // Not relevant for the cow
    }
}
