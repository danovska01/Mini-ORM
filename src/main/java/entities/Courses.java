package entities;

import orm.anotations.Column;
import orm.anotations.Entity;
import orm.anotations.Id;

@Entity(name = "courses")
public class Courses {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private final String name;
    @Column(name = "length_in_weeks")
    private final int weeksLength;


    public Courses(String name, int weeksLength) {
        this.name = name;
        this.weeksLength = weeksLength;
    }
}
