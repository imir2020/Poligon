package patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {
    public static void main(String[] args) {
DeveloperFactory developerFactory = new DeveloperFactory();

        List<Developer> developers = new ArrayList<>();

        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("Python"));
        developers.add(developerFactory.getDeveloperBySpeciality("Python"));
        developers.add(developerFactory.getDeveloperBySpeciality("Python"));
        developers.add(developerFactory.getDeveloperBySpeciality("Python"));
        developers.add(developerFactory.getDeveloperBySpeciality("Python"));
        developers.add(developerFactory.getDeveloperBySpeciality("Python"));

            for (Developer d:developers) {
                    d.writeCode();
            }
    }
}
