package patterns.behavioral.visitor;

public class Project implements ProjectElement{
    ProjectElement[] projectElements;
    public Project(){
        this.projectElements = new ProjectElement[]{
                new ProjectClass(),
                new DataBase(),
                new Test()
        };
    }
    @Override
    public void beWritten(Developer developer) {
        for (ProjectElement p:
             projectElements) {
            p.beWritten(developer);
        }
    }
}
