package Model;

import java.util.Objects;

public class Human {
    private int id;
    private int age;
    private String name;

    public Human (int id, int age, String name) {


        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (! (o instanceof Human)) return false;
        Human human = (Human) o;
        return id == human.id && age == human.age && name.equals (human.name);
    }

    @Override
    public int hashCode () {
        return Objects.hash (id, age, name);
    }

    @Override
    public String toString () {
        return "Human{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
