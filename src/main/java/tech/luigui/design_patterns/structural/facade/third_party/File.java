package tech.luigui.design_patterns.structural.facade.third_party;

public class File {
  private RawFile rawFile;

  public File(RawFile rawFile) {
    this.rawFile = rawFile;
  }

  public RawFile getRawFile() {
    return rawFile;
  }

  public void setRawFile(RawFile rawFile) {
    this.rawFile = rawFile;
  }
}
