class Voice {
    public void prepareVoice() {
        Animal[] animals = {new Cow(), new Dog(), new Pig(), new Goat(), new Lion()};
        hear(animals);
    }
    public void hear(Animal[] animals) {
        for (int i = 0; i < animals.length; i++) {
            animals[i].makeVoice();
        }
    }
}