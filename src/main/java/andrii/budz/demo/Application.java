package andrii.budz.demo;

import andrii.budz.demo.entity.Book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {
    public static void main(String[] args) {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("demobooks");

        EntityManager em = factory.createEntityManager();
//        Book book = new Book(1L, "Kobzar","bla", 100L, 1900L);
//        em.getTransaction().begin();
//        em.persist(book);
//
//        em.getTransaction().commit();
        em.close();
        factory.close();



    }
}
