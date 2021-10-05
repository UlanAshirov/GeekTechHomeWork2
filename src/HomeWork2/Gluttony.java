package HomeWork2;

public class Gluttony extends DanteHell {

    public Gluttony(String name, String punishment, String guard) {
        super(name, punishment, guard);
    }

    @Override
    public void print() {
        System.out.println("Третий круг ада " + getName() + ", " + getPunishment()
                + ", страж " + getGuard());
    }
}
