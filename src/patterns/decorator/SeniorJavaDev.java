package patterns.decorator;

public class SeniorJavaDev extends DeveloperDecorator{


    public SeniorJavaDev(Developer developer) {
        super(developer);
    }

    @Override
    public String makeJob(){
        return super.makeJob() + makeCodeReview();
    }

    private String makeCodeReview() {
        return "Make code rev/check ";
    }
}
