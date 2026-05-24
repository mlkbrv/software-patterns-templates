package behavioral.template;

public class WebsiteRunner {
    public static void main(String[] args) {
//        WelcomePage welcomePage = new WelcomePage();
//        welcomePage.showPage();
//        NewsPage newsPage = new NewsPage();
//        newsPage.showPage();
        WebsiteTemplate news = new NewsPage();
        news.showPage();
        WebsiteTemplate welcome = new WelcomePage();
        welcome.showPage();
    }
}
