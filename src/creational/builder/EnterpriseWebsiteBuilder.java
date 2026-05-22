package creational.builder;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder {
    @Override
    void buildName()
    {
        website.setName("Enterprise Website");
    }
    @Override
    void buildPrice()
    {
        website.setPrice(2000);
    }
    @Override
    void buildCms()
    {
        website.setCms(Cms.ALIFRESCO);
    }
}
