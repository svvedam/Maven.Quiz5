package rocks.zipcode.io.quiz4.collections;

import java.util.Comparator;

/**
 * @author leon on 11/12/2018.
 */
public class Student{
    Integer id;
    Double hours;
    public Student() {

        this(null);
        this.hours =0.0;
    }

    public Student(Integer id) {

        this.id = id;
        this.hours =0.0;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public void learn(Double amountOfHours) {
        hours += amountOfHours;
    }

    public Double getTotalStudyTime() {

        return hours;
    }

}
