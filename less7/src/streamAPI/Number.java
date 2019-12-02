package streamAPI;

public class Number {
    private String str;
    private Integer integer;

    public Number str(String str){
        this.str = str;
        return this;
    }
    public Number integer(Integer integer){
        this.integer = integer;
        return this;
    }

    @Override
    public String toString() {
        return "Number{" +
                "str='" + str + '\'' +
                ", integer=" + integer +
                '}';
    }
    public Integer getInteger() {
        return integer;
    }
}
