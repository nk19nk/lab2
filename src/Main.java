import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Задание 1.2");
        System.out.println("Введите имя человека");
        String nam=in.next();
        System.out.println("Введите рост человека");
        int h;
        while (true){
            h=in.nextInt();
            if(h<=40 || h>250){
                System.out.println("Введите нормальный рост");
            }else {
                break;
            }
        }
        HumanTask1 x=new HumanTask1(nam,h);
        System.out.println(x);
        System.out.println("Люди из задания:");
        HumanTask1 x1=new HumanTask1("Клеопатра", 152);
        System.out.println(x1);
        HumanTask1 x2=new HumanTask1("Пушкин", 167);
        System.out.println(x2);
        HumanTask1 x3=new HumanTask1("Владимир", 189);
        System.out.println(x3);
        in.nextLine();

        System.out.println("Задание 1.3");
        String surname;
        String name;
        String patronymic;
        while (true) {
            System.out.println("Введите фамилию:");
            surname = in.nextLine().trim();
            System.out.println("Введите имя:");
            name = in.nextLine().trim();
            System.out.println("Введите отчество:");
            patronymic = in.nextLine().trim();
            if (!surname.isEmpty() || !name.isEmpty() || !patronymic.isEmpty()) {
                break;
            } else {
                System.out.println("ФИО человека не может быть совсем пустым!");
            }
        }
        Names y = new Names(surname, name, patronymic);
        System.out.println(y);
        System.out.println("Люди из задания:");
        Names y1=new Names("Клеопатра");
        System.out.println(y1);
        Names y2=new Names("Пушкин", "Александр", "Сергеевич");
        System.out.println(y2);
        Names y3=new Names("Маяковский", "Владимир");
        System.out.println(y3);

        System.out.println("Задание 2.2");
        String surname2;
        String name2;
        String patronymic2;
        while (true) {
            System.out.println("Введите фамилию:");
            surname2 = in.nextLine().trim();
            System.out.println("Введите имя:");
            name2 = in.nextLine().trim();
            System.out.println("Введите отчество:");
            patronymic2 = in.nextLine().trim();
            if (!surname2.isEmpty() || !name2.isEmpty() || !patronymic2.isEmpty()) {
                break;
            } else {
                System.out.println("ФИО человека не может быть совсем пустым!");
            }
        }
        Names z = new Names(surname2, name2, patronymic2);
        System.out.println("Введите рост человека");
        int h2;
        while (true){
            h2=in.nextInt();
            if(h2<=40 || h2>250){
                System.out.println("Введите нормальный рост");
            }else {
                break;
            }
        }
        HumanTask2 n=new HumanTask2(z, h2);
        System.out.println(n);
        System.out.println("Люди из задания:");
        Names z1 = new Names( "Клеопатра");
        HumanTask2 n1=new HumanTask2(z1,152);
        System.out.println(n1);
        Names z2 = new Names("Пушкин", "Александр", "Сергеевич");
        HumanTask2 n2=new HumanTask2(z2,167);
        System.out.println(n2);
        Names z3 = new Names("Маяковский", "Владимир");
        HumanTask2 n3=new HumanTask2(z3,189);
        System.out.println(n3);

        System.out.println("Задание 3.3");
        System.out.println("Схема, представленная в задании:");
        CityTask1 a = new CityTask1("A");
        CityTask1 b = new CityTask1("B");
        CityTask1 c = new CityTask1("C");
        CityTask1 d = new CityTask1("D");
        CityTask1 e = new CityTask1("E");
        CityTask1 f = new CityTask1("F");
        a.addRoute(b, 5);
        a.addRoute(f, 1);
        a.addRoute(d, 6);
        b.addRoute(a, 5);
        b.addRoute(c, 3);
        c.addRoute(b, 3);
        c.addRoute(d, 4);
        d.addRoute(a, 6);
        d.addRoute(c, 4);
        d.addRoute(e, 2);
        e.addRoute(f, 2);
        f.addRoute(e, 2);
        f.addRoute(b, 1);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        System.out.println("Задание 4.8");
        System.out.println("Схема, представленная в задании:");
        CityTask2 a1 = new CityTask2("A");
        CityTask2 b1 = new CityTask2("B");
        CityTask2 c1 = new CityTask2("C");
        CityTask2 d1 = new CityTask2("D");
        CityTask2 e1 = new CityTask2("E");
        CityTask2 F1 = new CityTask2("F");
        List<CityTask2> destinations = new ArrayList<>();
        destinations.add(b1);
        destinations.add(d1);
        destinations.add(F1);
        List<Integer> costs = new ArrayList<>();
        costs.add(5);
        costs.add(1);
        costs.add(6);
        CityTask2 a11 = new CityTask2("A", destinations, costs);
        List<CityTask2> destinations1 = new ArrayList<>();
        destinations1.add(a1);
        destinations1.add(c1);
        List<Integer> costs1 = new ArrayList<>();
        costs1.add(5);
        costs1.add(3);
        CityTask2 b11 = new CityTask2("B", destinations1, costs1);
        List<CityTask2> destinations2 = new ArrayList<>();
        destinations2.add(b1);
        destinations2.add(d1);
        List<Integer> costs2 = new ArrayList<>();
        costs2.add(3);
        costs2.add(4);
        CityTask2 c11 = new CityTask2("C", destinations2, costs2);
        List<CityTask2> destinations3 = new ArrayList<>();
        destinations3.add(a1);
        destinations3.add(c1);
        destinations3.add(e1);
        List<Integer> costs3 = new ArrayList<>();
        costs3.add(6);
        costs3.add(4);
        costs3.add(2);
        CityTask2 d11 = new CityTask2("D", destinations3, costs3);
        List<CityTask2> destinations4 = new ArrayList<>();
        destinations4.add(F1);
        List<Integer> costs4 = new ArrayList<>();
        costs4.add(2);
        CityTask2 e11 = new CityTask2("E", destinations4, costs4);
        List<CityTask2> destinations5 = new ArrayList<>();
        destinations5.add(e1);
        destinations5.add(b1);
        List<Integer> costs5 = new ArrayList<>();
        costs5.add(2);
        costs5.add(1);
        CityTask2 F11 = new CityTask2("F", destinations5, costs5);
        System.out.println(a11);
        System.out.println(b11);
        System.out.println(c11);
        System.out.println(d11);
        System.out.println(e11);
        System.out.println(F11);

        System.out.println("Задание 5.5");
        System.out.println("Введите 1-ую дробь");
        System.out.println("числитель:");
        int ch1;
        while (true) {
            if (in.hasNextInt()) {
                ch1=in.nextInt();
                break;
            } else {
                System.out.println("Ошибка: введите целое число!");
                in.next();
            }
        }
        System.out.println("знаменатель:");
        int zn1;
        while (true) {
            if (in.hasNextInt()) {
                zn1=in.nextInt();
                break;
            } else {
                System.out.println("Ошибка: введите целое число!");
                in.next();
            }
        }
        System.out.println("Введенная дробь:");
        Fraction f1 = new Fraction(ch1, zn1);
        System.out.println(f1);

        System.out.println("Введите 2-ую дробь");
        System.out.println("числитель:");
        int ch2;
        while (true) {
            if (in.hasNextInt()) {
                ch2=in.nextInt();
                break;
            } else {
                System.out.println("Ошибка: введите целое число!");
                in.next();
            }
        }
        System.out.println("знаменатель:");
        int zn2;
        while (true) {
            if (in.hasNextInt()) {
                zn2=in.nextInt();
                break;
            } else {
                System.out.println("Ошибка: введите целое число!");
                in.next();
            }
        }
        System.out.println("Введенная дробь:");
        Fraction f2 = new Fraction(ch2, zn2);
        System.out.println(f2);

        System.out.println("Введите 3-ую дробь");
        int ch3;
        while (true) {
            if (in.hasNextInt()) {
                ch3=in.nextInt();
                break;
            } else {
                System.out.println("Ошибка: введите целое число!");
                in.next();
            }
        }
        System.out.println("знаменатель:");
        int zn3;
        while (true) {
            if (in.hasNextInt()) {
                zn3=in.nextInt();
                break;
            } else {
                System.out.println("Ошибка: введите целое число!");
                in.next();
            }
        }
        System.out.println("Введенная дробь:");
        Fraction f3 = new Fraction(ch3, zn3);
        System.out.println(f3);

        System.out.println("Сложение дробей:");
        System.out.println(f1 + " + " + f2 + " = " + f1.addFraction(f2));
        System.out.println("Вычитание дробей:");
        System.out.println(f1 + " - " + f2 + " = " + f1.subtractFraction(f2));
        System.out.println("Умножение дробей:");
        System.out.println(f1 + " * " + f2 + " = " + f1.multiplyFraction(f2));
        System.out.println("Деление дробей:");
        System.out.println(f1 + " / " + f2 + " = " + f1.divideFraction(f2));

        System.out.println("Введите целое число:");
        int num;
        while (true) {
            if (in.hasNextInt()) {
                num=in.nextInt();
                break;
            } else {
                System.out.println("Ошибка: введите целое число!");
                in.next();
            }
        }
        Fraction numf = new Fraction(num, 1);
        System.out.println("Сложение дроби и числа:");
        System.out.println(f1 + " + " + num + " = " + f1.addFraction(numf));
        System.out.println("Вычитание дроби и числа:");
        System.out.println(f2 + " - " + num + " = " + f1.subtractFraction(numf));
        System.out.println("Умножение дроби и числа:");
        System.out.println(f3 + " * " + num + " = " + f1.multiplyFraction(numf));
        System.out.println("Деление дроби и числа:");
        System.out.println(f1 + " / " + num + " = " + f1.divideFraction(numf));
        Fraction f5=new Fraction(5);
        System.out.println(
                "Результат f1.addFraction(f2).divideFraction(f3).subtractFraction(f5) = " +
                        f1.addFraction(f2).divideFraction(f3).subtractFraction(f5)
        );
        in.close();
    }
}