class Pandav extends Bharatvanshi {
    public Pandav(String name) {
        super(name);
    }
    @Override
    public void obey() {
        System.out.println(name + " is obeying.");
    }
    @Override
    public void kind() {
        System.out.println(name + " is kind.");
    }
}
