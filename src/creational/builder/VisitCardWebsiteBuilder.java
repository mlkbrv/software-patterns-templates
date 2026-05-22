package creational.builder;

public class VisitCardWebsiteBuilder extends WebsiteBuilder {
    @Override
    void buildName()
    {
        website.setName("VisitCard");
    }
    @Override
    void buildPrice()
    {
        website.setPrice(1000);
    }
    @Override
    void buildCms()
    {
        website.setCms(Cms.WORDPRESS);
    }
}
