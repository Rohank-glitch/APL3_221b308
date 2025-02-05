abstract class Bharatvanshi {
    String name;
    public Bharatvanshi(String name) {
        this.name = name;
    }
    public void fight() {
        System.out.println(name + " is fighting.");
    }
    public abstract void obey();
    public abstract void kind();
}