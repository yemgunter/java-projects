public class Dog implements Animal {
    public String speak() { // implement speak method
        return "I am a dog.\nMy name is Fido.";
    }

    public void sleep(String data) { // Implement sleep method
        System.out.print(data + ":Snooze - ");
    }

    public int run() { // run method
        return 1024; // Specific value for the dog
    }
}
