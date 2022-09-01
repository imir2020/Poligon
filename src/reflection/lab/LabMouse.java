package reflection.lab;

import annotations.Test1;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

public class LabMouse {
    @Deprecated
    int age;
    @Deprecated
    @MouseAnnotation
    String name = "s";

    @Deprecated
    String salary;

    public LabMouse() {
    }

//    public LabMouse(int age, String name, String salary) {
//        this.age = age;
//        this.name = name;
//        this.salary = salary;
//    }

    void met1() {
        System.out.println(age);
    }

    void met2() {
        System.out.println(name);
    }

    void met3() {
        System.out.println(salary);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getSalary() {
//        return salary;
//    }
//
//    public void setSalary(String salary) {
//        this.salary = salary;
//    }

    @Override
    public String toString() {
        return "LabMouse{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                '}' + " " + this.hashCode();
    }
}
