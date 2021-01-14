package tech.luigui.design_patterns.structural.proxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib{

  List<String> videosNames = new ArrayList<>();
  Map<Long, String> videosInfo = new HashMap<>();
  Map<Long, Video> videoMap = new HashMap<>();

  @Override
  public synchronized List<String> listVideos() throws InterruptedException {
    Thread.sleep(100);
    return videosNames;
  }

  @Override
  public synchronized String getVideoInfo(Long id) throws InterruptedException {
    Thread.sleep(100);
    return videosInfo.get(id);
  }

  @Override
  public synchronized Video downloadVideo(Long id) throws InterruptedException {
    Thread.sleep(100);
    return videoMap.get(id);
  }

  @Override
  public synchronized void addVideo(Video video) throws InterruptedException {
    if(videoMap.containsKey(video.getId()))
      return;
    Thread.sleep(100);
    videoMap.put(video.getId(), video);
    videosInfo.put(video.getId(), video.getVideoInfo());
    videosNames.add(video.getName());
  }
}
