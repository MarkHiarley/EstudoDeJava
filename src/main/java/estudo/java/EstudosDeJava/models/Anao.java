package estudo.java.EstudosDeJava.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.annotations.UuidGenerator;

import java.sql.Timestamp;
import java.util.UUID;


@Entity

public class Anao {
    @Id
    @UuidGenerator
    private UUID id;
    private String name;
    private int age;
    private int height;

    @jdk.jfr.Timestamp
    private Timestamp createdAt;

    private Timestamp updatedAt;

    public Anao(UUID id, String name, int age, int height, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.height = height;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
}
