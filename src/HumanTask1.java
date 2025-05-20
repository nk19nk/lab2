public class HumanTask1 {
    private String name;
    private int height;

    String setName(String name) {
        this.name=name;
        return this.name;
    }
    String getName() {
        return this.name;
    }
    int setHeight(int height) {
        this.height=height;
        return this.height;
    }
    int getHeight() {
        return this.height;
    }

    HumanTask1(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String convertToString(){
        return name + ", рост: " + height;
    }
}
