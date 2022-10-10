package patterns.creational.abstractfactory.builder;

public class EnterpriceWebsiteBuilder extends WebSiteBuilder {
    @Override
    void buildName() {
        getWebSite().setName("Enterprise web site");
    }

    @Override
    void buildCms() {
        getWebSite().setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        getWebSite().setPrice(10000);
    }
}
