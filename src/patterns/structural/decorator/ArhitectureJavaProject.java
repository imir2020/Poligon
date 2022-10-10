package patterns.structural.decorator;

public class ArhitectureJavaProject extends DeveloperDecorator{
    public ArhitectureJavaProject(Developer developer) {
        super(developer);
    }
    public String arhitectCheck(){
        return " Check arhitect of project";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + arhitectCheck();
    }
}
