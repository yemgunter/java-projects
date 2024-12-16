public class Cat implements Animal {
    public String speak() { // implement speak method
        return "I am a cat.\nMy name is Cleo.";
    }

    public void sleep(String data) { // Implement sleep method
        System.out.print(data + ":Snore - ");
    }

    public int run() { // run method
        return 0; // Not relevant for the cat
    }
}
