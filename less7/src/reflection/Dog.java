package reflection;
@jsonSerializable
public class Dog {
    @jsonElement
    private int age;
    @jsonElement(key = "dogAge")
    private String name;

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @MethodInv
    private void voice(){
        System.out.println("Buff !");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
