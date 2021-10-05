package HomeWork2;

public class Lust extends DanteHell {

    public Lust(String name, String punishment, String guard) {
        super(name, punishment, guard);
    }

    @Override
    public void print() {
        System.out.println("Второй круг ада " + getName() + ", " + getPunishment()
                + ", страж " + getGuard());
    }
}
