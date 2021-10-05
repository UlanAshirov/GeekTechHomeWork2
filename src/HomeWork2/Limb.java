package HomeWork2;

public class Limb extends DanteHell {

    public Limb(String name, String punishment, String guard) {
        super(name, punishment, guard);
    }

    @Override
    public void print() {
        System.out.println("Первый круг ада " + getName() + ", " + getPunishment()
                + ", страж " + getGuard());
    }
}

