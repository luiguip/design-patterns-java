package tech.luigui.design_patterns.structural.proxy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;

public class ThirdPartyYoutubeLibTest {

  Instant startTime;
  Instant midTime;
  Instant endTime;

  ThirdPartyYoutubeLib youtubeCache = init();

  private ThirdPartyYoutubeLib init() {
   ThirdPartyYoutubeClass thirdPartyYoutubeClass = new ThirdPartyYoutubeClass();
   return new CachedYoutubeClass(thirdPartyYoutubeClass);
  }

  @Test
  void addVideosTest() throws InterruptedException {
    for(long i = 0L; i< 10L; i++) {
      Video video = new Video(i);
      startTime = Instant.now();
      youtubeCache.addVideo(video);
      midTime = Instant.now();
      youtubeCache.addVideo(video);
      endTime = Instant.now();
      printTimes();
      assertTimes();
    }
  }

  @Test
  void listVideosTest() throws  InterruptedException {
    addVideosTest();
    startTime = Instant.now();
    youtubeCache.listVideos();
    midTime = Instant.now();
    youtubeCache.listVideos();
    endTime = Instant.now();
    printTimes();
    assertTimes();
  }

  @Test
  void getVideoInfoTest() throws  InterruptedException {
    addVideosTest();
    for(long i = 0L; i< 10L; i++) {
      startTime = Instant.now();
      youtubeCache.getVideoInfo(i);
      midTime = Instant.now();
      youtubeCache.getVideoInfo(i);
      endTime = Instant.now();
      printTimes();
      assertTimes();
    }
  }

  @Test
  void downloadVideoTest() throws  InterruptedException {
    addVideosTest();
    for(long i = 0L; i< 10L; i++) {
      startTime = Instant.now();
      youtubeCache.downloadVideo(i);
      midTime = Instant.now();
      youtubeCache.downloadVideo(i);
      endTime = Instant.now();
      printTimes();
      assertTimes();
    }
  }

  private void assertTimes() {
    Assertions.assertTrue(
      (Duration.between(midTime, endTime).minus(Duration.between(startTime, midTime))).toNanos() < 0);
  }

  private void printTimes() {
    System.out.println("Time1: " + Duration.between(startTime, midTime));
    System.out.println("Time2: " + Duration.between(midTime, endTime));
  }
}
