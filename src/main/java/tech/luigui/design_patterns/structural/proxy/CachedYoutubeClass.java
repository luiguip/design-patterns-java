package tech.luigui.design_patterns.structural.proxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CachedYoutubeClass implements ThirdPartyYoutubeLib{

  private final ThirdPartyYoutubeLib service;
  private List<String> videosNames = new ArrayList<>();
  private Map<Long, String> videosInfo = new HashMap<>();
  private Map<Long, Video> videosMap = new HashMap<>();

  public CachedYoutubeClass(ThirdPartyYoutubeLib service) {
    this.service = service;
  }

  @Override
  public List<String> listVideos() throws InterruptedException {
    if(videosNames.isEmpty())
      videosNames = service.listVideos();
    return videosNames;
  }

  @Override
  public String getVideoInfo(Long id) throws InterruptedException {
    if(!videosInfo.containsKey(id))
      videosInfo.put(id, service.getVideoInfo(id));
    return videosInfo.get(id);
  }

  @Override
  public Video downloadVideo(Long id) throws InterruptedException {
    if(!videosMap.containsKey(id))
      videosMap.put(id, service.downloadVideo(id));
    return videosMap.get(id);
  }

  @Override
  public void addVideo(Video video) throws InterruptedException {
    service.addVideo(video);
  }
}
