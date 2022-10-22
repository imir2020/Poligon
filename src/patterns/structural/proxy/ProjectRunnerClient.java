package patterns.structural.proxy;

public class ProjectRunnerClient {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.github.com/imir2020");
        project.run();
    }
}
