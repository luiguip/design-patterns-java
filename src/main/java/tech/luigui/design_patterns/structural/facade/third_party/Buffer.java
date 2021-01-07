package tech.luigui.design_patterns.structural.facade.third_party;

public class Buffer {
  private String fileName;
  private SourceCodec sourceCodec;


  public Buffer(String fileName, SourceCodec sourceCodec) {
    this.fileName = fileName;
    this.sourceCodec = sourceCodec;
  }

  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public SourceCodec getSourceCodec() {
    return sourceCodec;
  }

  public void setSourceCodec(SourceCodec sourceCodec) {
    this.sourceCodec = sourceCodec;
  }


}
