package tech.luigui.design_patterns.structural.facade.third_party;

public class BitrateReader {

  public static Buffer read(String filename, SourceCodec sourceCodec){
    return new Buffer(filename, sourceCodec);
  }

  public static RawFile convert(Buffer buffer, CompressionCodec destinationCodec) {
    return new RawFile(buffer, destinationCodec);
  }
}
