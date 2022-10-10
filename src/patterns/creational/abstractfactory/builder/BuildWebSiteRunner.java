package patterns.creational.abstractfactory.builder;

public class BuildWebSiteRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new VisitCardWebsiteBuilder());
        WebSite webSite = director.builderWebSite();

        System.out.println(webSite);
    }
}
