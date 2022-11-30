package patterns.creational.builder;

public class VisitCardWebsiteBuilder extends WebSiteBuilder {
    @Override
    void buildName() {
        getWebSite().setName("Visit card");
    }

    @Override
    void buildCms() {
        getWebSite().setCms(Cms.WORDPRESS);
    }

    @Override
    void buildPrice() {
        getWebSite().setPrice(500);
    }
}
