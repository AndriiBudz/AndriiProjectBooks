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
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
    private String biography;

    @ManyToMany(mappedBy = "authors")
    private List<Book> books;
}
