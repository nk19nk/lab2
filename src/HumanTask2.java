public class HumanTask2 {
    private Names name;
    private int height;

    Names setName(Names name) {
        this.name=name;
        return this.name;
    }
    Names getName() {
        return this.name;
    }
    int setHeight(int height) {
        this.height=height;
        return this.height;
    }
    int getHeight() {
        return this.height;
    }

    HumanTask2(Names name, int height) {
        this.name = name;
        this.height = height;
    }

    public String convertToString(){
        return name + ", рост: " + height;
    }
}
