package structural.proxy;

public class XVideoLib implements ThirdPartyVideoLib {
    @Override
    public void downloadVideo(String videoId) {
        System.out.println("Connecting to YouTube...");
        System.out.println("Downloading video with ID: " + videoId + " (Takes time and bandwidth...)");
    }
}