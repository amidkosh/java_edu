package task3;

import java.io.*;

public class Human extends Animal implements Externalizable {
    private String name;
    private int age;

    public Human(){}

    public static void main(String[] args) {
        Human h = new Human("tretr",45);
//        try {
//            File file = new File("himanFile.txt");
//            ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream(file));
//            oos.writeObject(h);
//            oos.close();
//
//            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//            Human h2 = (Human) ois.readObject();
//            System.out.println(h2);
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }

        try(ByteArrayOutputStream out = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(out);) {

            oos.writeObject(h);

            byte[] bytes = out.toByteArray();
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bytes));
            Human h2 = (Human) ois.readObject();
            System.out.println(h2);


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.setLegsCount(4);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", legs=" + getLegsCount() +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

        out.write(age);
//        System.out.println(this.getLegsCount());
        out.write(this.getLegsCount());
        out.write(name.getBytes());
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        age = in.read();
        this.setLegsCount(in.read());
        name =in.readLine();
    }
}
