package patterns.behavioral.iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "Maven", "PostgreSQL"};
        JavaTeveloper javaTeveloper = new JavaTeveloper("Eugen Sul", skills);

        Jterator jterator = javaTeveloper.getJterator();
        System.out.println("Typeloper: " + javaTeveloper.getName());
        System.out.println("Skills: ");

        while (jterator.hasNext()){
            System.out.print(jterator.next().toString() + ", ");
        }
    }
}
