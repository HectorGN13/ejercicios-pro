public class Coche implements Cloneable {

    private Rueda r1;      //<<R>>
    private Rueda r2;     //<<R>>
    private Rueda r3;     //<<R>>
    private Rueda r4;     //<<R>>


    public Coche(Rueda r1, Rueda r2, Rueda r3, Rueda r4) {
        this.r1 = r1;
        this.r2 = r2;
        this.r3 = r3;
        this.r4 = r4;
    }

    public Rueda getR1() {
        return r1;
    }

    public Rueda getR2() {
        return r2;
    }

    public Rueda getR3() {
        return r3;
    }

    public Rueda getR4() {
        return r4;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {

        try {
            Rueda r1 = new Rueda(getR1().getPresion(), getR1().getDimension());
            Rueda r2 = new Rueda(getR2().getPresion(), getR2().getDimension());
            Rueda r3 = new Rueda(getR3().getPresion(), getR3().getDimension());
            Rueda r4 = new Rueda(getR4().getPresion(), getR4().getDimension());
            return new Coche (r1, r2, r3, r4);
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "Coche{" +
                "r1=" + r1 +
                ", r2=" + r2 +
                ", r3=" + r3 +
                ", r4=" + r4 +
                '}';
    }
}