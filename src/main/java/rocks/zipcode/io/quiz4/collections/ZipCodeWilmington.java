package rocks.zipcode.io.quiz4.collections;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington{
    List<Student> enrolledStudents;
    public ZipCodeWilmington(){
        this.enrolledStudents= new ArrayList<>();
    }
    public void enroll(Student student) {
        enrolledStudents.add(student);
    }

    public Boolean isEnrolled(Student student) {

        if(enrolledStudents.contains(student))
            return true;
        else
            return false;
    }

    public void lecture(double numberOfHours) {
        for (Student student : enrolledStudents) {
            student.learn(numberOfHours);
        }
    }

    public Map<Student, Double> getStudyMap() {
        HashMap<Student,Double> returnMap = new HashMap<>();
        for (Student student : enrolledStudents) {
            returnMap.put(student,student.getTotalStudyTime());
        }

        return returnMap;
    }

}
