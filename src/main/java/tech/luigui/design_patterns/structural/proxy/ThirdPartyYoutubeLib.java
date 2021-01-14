package tech.luigui.design_patterns.structural.proxy;

import java.util.List;

public interface ThirdPartyYoutubeLib {
  List<String> listVideos() throws InterruptedException;
  String getVideoInfo(Long id) throws InterruptedException;
  Video downloadVideo(Long id) throws InterruptedException;
  void addVideo(Video video) throws InterruptedException;
}
