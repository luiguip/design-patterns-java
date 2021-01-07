package tech.luigui.design_patterns.structural.facade.third_party;

public class VideoFile {
  private String filename;

  public VideoFile(String filename) {
    this.filename = filename;
  }

  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }
}
