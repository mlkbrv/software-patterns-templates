package proxy;

import java.util.HashMap;
import java.util.Map;

public class CachedVideoProxy implements ThirdPartyVideoLib {
    private ThirdPartyVideoLib realService;
    private Map<String, Boolean> cache = new HashMap<>();

    public CachedVideoProxy(ThirdPartyVideoLib service) {
        this.realService = service;
    }

    @Override
    public void downloadVideo(String videoId) {
        if (cache.containsKey(videoId)) {
            System.out.println("[PROXY] Video " + videoId + " found in cache. Returning immediately.");
            return;
        }

        System.out.println("[PROXY] Video " + videoId + " not found in cache. Delegating to real service...");
        realService.downloadVideo(videoId);
        cache.put(videoId, true);
    }
}