package tech.luigui.design_patterns.structural.facade.third_party;

public class RawFile {
  private Buffer buffer;
  private CompressionCodec destinationCodec;

  public RawFile(Buffer buffer, CompressionCodec destinationCodec) {
    this.buffer = buffer;
    this.destinationCodec = destinationCodec;
  }

  public CompressionCodec getDestinationCodec() {
    return destinationCodec;
  }

  public void setDestinationCodec(CompressionCodec destinationCodec) {
    this.destinationCodec = destinationCodec;
  }

  public Buffer getBuffer() {
    return buffer;
  }

  public void setBuffer(Buffer buffer) {
    this.buffer = buffer;
  }
}
