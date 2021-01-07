package tech.luigui.design_patterns.structural.facade.third_party;

public class CodecFactory {
  public static SourceCodec extract(VideoFile file) {
    return new SourceCodec();
  }
}
