package patterns.behavioral.state;

public class DeveloperDay {
    public static void main(String[] args) {
        Activity activity = new Reading();
        Developer developer = new Developer();

        developer.setActivity(activity);
        for (int i = 0; i <10 ; i++) {
            developer.justDoIt();
            developer.changeActivity();
        }
    }
}
