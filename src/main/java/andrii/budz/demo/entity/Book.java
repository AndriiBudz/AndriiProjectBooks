package andrii.budz.demo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Setter
@Getter
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String info;
    private Long price;
    private Long year;

    @ManyToMany
    private List<Category> categories;



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
