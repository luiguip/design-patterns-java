package tech.luigui.design_patterns.structural.proxy;

public class Video {
  private Long id;
  private String name;
  private String videoInfo;

  public Video(Long id) {
    this.id = id;
    this.name = "Name id:" + id;
    this.videoInfo = "Video id:" +id;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getVideoInfo() {
    return videoInfo;
  }
}
