public class Proj10RunnerA implements Proj10X {
    private int data; // Store the incoming randomData

    public Proj10RunnerA(int data) {
        this.data = data; // Save data for later use
    }

    @Override
    public int getData() {
        return data; // Return the original randomData
    }

    @Override
    public int getModifiedData() {
        return data - 1; // Return randomData - 1
    }

    @Override
    public String toString() {
        return "Proj10RunnerA, Asher YourLastName"; // Include name
    }
}
