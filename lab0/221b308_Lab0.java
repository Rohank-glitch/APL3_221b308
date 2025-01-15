public class JUET {
    private String name;
    public String getName (){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    private int age;
    public int getAge (){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public static void main(String[] args) {
        JUET a = new JUET();
        a.setAge(10);
        a.setName("ten");
        System.out.println("name = "+ a.getName() +"\nage = "+ a.getAge());
    }

}