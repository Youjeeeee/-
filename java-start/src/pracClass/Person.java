package pracClass;

public class Person {
    int height;
    int weight;
    String name;

    public Person(int height, int weight, String name) {
        this.height = height;
        this.weight = weight;
        this.name = name;
    }

    void getHeight(int cm){

        this.height += cm;
    }
}
