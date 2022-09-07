package patterns.fabric;

public class Program {

    public static void main(String[] args) {
       DeveloperFactory developerFactory = createDeveloperBySpeciality("php");
       Developer developer = developerFactory.createDeveloper();
       developer.writeCode();
       developerFactory = new CppDeveloperFactory();
       developer = developerFactory.createDeveloper();
       developer.writeCode();

    }


    static DeveloperFactory createDeveloperBySpeciality(String spec){
        if(spec.equalsIgnoreCase("java")){
            return new JavaDeveloperFactory();
        } else if (spec.equalsIgnoreCase("c++")){
            return new CppDeveloperFactory();
        }else {
            throw new RuntimeException(spec + " is unknown");
        }
    }
}
