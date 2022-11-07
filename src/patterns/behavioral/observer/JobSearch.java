package patterns.behavioral.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First java position");
        jobSite.addVacancy("Second java position");

        Observer firstSubscriber = new Subscriber("Eugen Sul");
        Observer secondSubscriber = new Subscriber("Peter Rome");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Third java position");

        jobSite.removeVacancy("First java position");
    }
}
