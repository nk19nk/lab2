public class Fraction {
    //поля
    private int chisl;
    private int znam;
    //свойства
    int setChisl(int chisl) {
        this.chisl=chisl;
        return this.chisl;
    }
    int setZnam(int znam) {
        if (znam==0){
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю");
        }
        this.znam=znam;
        return this.znam;
    }
    int getChisl() {
        return this.chisl;
    }
    int getZnam() {
        return this.znam;
    }
    //конструктор
    Fraction(int chisl, int znam) {
        if (znam==0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю");
        }
        this.chisl=chisl;
        this.znam=znam;
        simp();
    }
    //методы
    private void simp() {
        int nod=nod(chisl, znam);
        chisl/=nod;
        znam/=nod;
        // чтобы - был перед дробью а не перед знаменателем
        if (znam<0) {
            chisl=-chisl;
            znam=-znam;
        }
    }

    private int nod(int a, int b) {
        if (b==0) {
            return Math.abs(a);
        } else {
            return nod(b, a%b);
        }
    }

    public String toString() {
        return chisl+"/"+znam;
    }

    public Fraction sum(Fraction other) {
        int newchisl=this.chisl*other.znam+other.chisl*this.znam;
        int newznam=this.znam*other.znam;
        return new Fraction(newchisl, newznam);
    }

    public Fraction minus(Fraction other) {
        int newchisl=this.chisl*other.znam-other.chisl*this.znam;
        int newznam=this.znam*other.znam;
        return new Fraction(newchisl, newznam);
    }

    public Fraction multiply(Fraction other) {
        int newchisl=this.chisl*other.chisl;
        int newznam=this.znam*other.znam;
        return new Fraction(newchisl, newznam);
    }

    public Fraction div(Fraction other) {
        if (other.chisl==0){
            throw new ArithmeticException();
        }
        int newchisl=this.chisl*other.znam;
        int newznam=this.znam*other.chisl;
        return new Fraction(newchisl, newznam);
    }
}
