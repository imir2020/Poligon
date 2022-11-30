package patterns.creational.builder;

public abstract class WebSiteBuilder {

   private WebSite webSite;

    void createWebSite() {
        webSite = new WebSite();
    }

    abstract void buildName();

    abstract void buildCms();

    abstract void buildPrice();

    WebSite getWebSite() {
        return webSite;
    }

}
