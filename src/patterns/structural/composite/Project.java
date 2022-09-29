package patterns.structural.composite;



public class Project {
    public static void main(String[] args) {
        Team team = new Team();

        Developer developer = new JavaDeveloper();
        Developer developer1 = new JavaDeveloper();
        Developer cppDeveloper = new CppDeveloper();

        team.addDeveloper(developer);
        team.addDeveloper(developer1);
        team.addDeveloper(cppDeveloper);

        team.createProject();
    }
}
