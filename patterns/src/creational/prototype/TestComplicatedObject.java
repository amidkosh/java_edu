package creational.prototype;

public class TestComplicatedObject {
    public static void main(String[] args) {
        ComplicatedObject prototype = new ComplicatedObject();
        ComplicatedObject clone = prototype.copy();

        clone.setType(ComplicatedObject.Type.TWO);

        System.out.println(prototype.equals(clone));
        System.out.println(prototype.toString());
        System.out.println(clone.toString());
    }
}
