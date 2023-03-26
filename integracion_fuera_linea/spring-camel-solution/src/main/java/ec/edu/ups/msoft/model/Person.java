package ec.edu.ups.msoft.model;

import javax.persistence.*;

@Entity
@Table(name = "t_person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "per_id")
    private Integer id;
    @Column(name = "client_id")
    private Integer clientId;
    @Column(name = "per_genre")
    private Integer genre;
    @Column(name = "per_age")
    private Integer age;

    public Person() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", clientId=" + clientId +
                ", genre=" + genre +
                ", age=" + age +
                '}';
    }

    public Person(Integer clientId, Integer genre, Integer age) {
        this.clientId = clientId;
        this.genre = genre;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getGenre() {
        return genre;
    }

    public void setGenre(Integer genre) {
        this.genre = genre;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
