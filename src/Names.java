public class Names {
    //поля
    private String surname;
    private String name;
    private String patronymic;
    //свойства
    String setName(String name) {
        this.name=name;
        return this.name;
    }
    String getName() {
        return this.name;
    }
    String setSurname(String surname) {
        this.surname=surname;
        return this.surname;
    }
    String getSurname() {
        return this.surname;
    }
    String setPatronymic(String patronymic) {
        this.patronymic=patronymic;
        return this.patronymic;
    }
    String getPatronymic() {
        return this.patronymic;
    }
    //конструктор
    Names(String surname, String name, String patronymic) {
        this.name=name;
        this.surname=surname;
        this.patronymic=patronymic;
    }
    Names(String surname,String name){
        this(surname,name,null);
    }
    Names(String surname){
        this(surname,null,null);
    }
    //методы
    public String toString(){
        StringBuilder rez=new StringBuilder();
        if (surname!=null && !surname.isEmpty()){
            rez.append(surname);
        }
        if (name!=null && !name.isEmpty()){
            if (!rez.isEmpty()){
                rez.append(" ");
            }
            rez.append(name);
        }
        if (patronymic!=null && !patronymic.isEmpty()){
            if (!rez.isEmpty()){
                rez.append(" ");
            }
            rez.append(patronymic);
        }
        return rez.toString();
    }
}
