package JDBC;


public class Product {
    private Integer id;
    private String name;
    private String description;

    Product(){}

    Product(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public Integer save() {
        DBworker w = new DBworker();
        w.save(this);
    }
}
