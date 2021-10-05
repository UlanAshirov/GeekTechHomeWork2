package HomeWork2;

public abstract class DanteHell implements Printable {
    private String name;
    private String punishment;
    private String guard;

    public DanteHell(String name, String punishment, String guard) {
        this.name = name;
        this.punishment = punishment;
        this.guard = guard;
    }

    public String getName() {
        return name;
    }

    public String getPunishment() {
        return punishment;
    }

    public String getGuard() {
        return guard;
    }
}
