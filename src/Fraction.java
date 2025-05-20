public class Fraction {
    private int chisl;
    private int znam;

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

    Fraction(int chisl, int znam) {
        if (znam==0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю");
        }
        this.chisl=chisl;
        this.znam=znam;
        simplify();
    }
    Fraction(int chisl){
        this(chisl,1);
    }

    private void simplify() {
        int nod= calculateGcd(chisl, znam);
        chisl/=nod;
        znam/=nod;
        if (znam<0) {
            chisl=-chisl;
            znam=-znam;
        }
    }

    private int calculateGcd(int a, int b) {
        if (b==0) {
            return Math.abs(a);
        } else {
            return calculateGcd(b, a%b);
        }
    }

    public String convertToString() {
        return chisl+"/"+znam;
    }

    public Fraction addFraction(Fraction other) {
        int newchisl=this.chisl*other.znam+other.chisl*this.znam;
        int newznam=this.znam*other.znam;
        return new Fraction(newchisl, newznam);
    }

    public Fraction subtractFraction(Fraction other) {
        int newchisl=this.chisl*other.znam-other.chisl*this.znam;
        int newznam=this.znam*other.znam;
        return new Fraction(newchisl, newznam);
    }

    public Fraction multiplyFraction(Fraction other) {
        int newchisl=this.chisl*other.chisl;
        int newznam=this.znam*other.znam;
        return new Fraction(newchisl, newznam);
    }

    public Fraction divideFraction(Fraction other) {
        if (other.chisl==0){
            throw new ArithmeticException();
        }
        int newchisl=this.chisl*other.znam;
        int newznam=this.znam*other.chisl;
        return new Fraction(newchisl, newznam);
    }
}
