package patterns.creational.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(2, "superHero", "SourceCode sourceCode = new SourceCode();\n");

        System.out.println(master);//+ " " + master.hashCode()

        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();
        System.out.println("\n======================\n");
        System.out.println(masterClone);//+ " " + masterClone.hashCode()
    }
}
