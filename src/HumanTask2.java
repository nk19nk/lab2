public class HumanTask2 {
    //поля
    private Names name;
    private int height;
    //свойства
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
    //конструктор
    HumanTask2(Names name, int height) {
        this.name = name;
        this.height = height;
    }
    //методы
    public String toString(){
        return name + ", рост: " + height;
    }
}
