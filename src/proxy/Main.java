package proxy;

public class Main {
    public static void main(String[] args) {
        ThirdPartyVideoLib realService = new XVideoLib();
        ThirdPartyVideoLib proxy = new CachedVideoProxy(realService);

        System.out.println("--- User requests Video 1 ---");
        proxy.downloadVideo("video_123");

        System.out.println("\n--- User requests Video 1 AGAIN ---");
        proxy.downloadVideo("video_123");

        System.out.println("\n--- User requests Video 2 ---");
        proxy.downloadVideo("video_abc");
    }
}
