package patterns.decorator;

public class Task {
    public static void main(String[] args) {
        Developer developer = new ArhitectureJavaProject(new JavaTeamLead(new SeniorJavaDev(new DevJava())));

        System.out.println(developer.makeJob());
    }
}
