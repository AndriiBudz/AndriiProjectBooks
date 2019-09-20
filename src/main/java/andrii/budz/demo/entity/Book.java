package andrii.budz.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    private Long id;
    private String name;
    private String info;
    private Long price;
    private Long year;

    public Book() {
    }

    public Book(Long id, String name, String info, Long price, Long year) {
        this.id = id;
        this.name = name;
        this.info = info;
        this.price = price;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", info='" + info + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}
