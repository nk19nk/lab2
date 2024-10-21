public class Human {
    //поля
    private String name;
    private int height;
    //свойства
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
    //конструктор
    Human(String name, int height) {
        this.name = name;
        this.height = height;
    }
    //методы
    public String toString(){
        return name + ", рост: " + height;
    }
}
