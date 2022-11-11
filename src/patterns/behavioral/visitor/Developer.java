package patterns.behavioral.visitor;

public interface Developer {
    void create(ProjectClass projectClass);

    void create(DataBase dataBase);

    void create(Test test);

}
