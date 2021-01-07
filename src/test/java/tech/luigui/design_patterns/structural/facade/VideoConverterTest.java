package tech.luigui.design_patterns.structural.facade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tech.luigui.design_patterns.structural.facade.third_party.File;
import tech.luigui.design_patterns.structural.facade.third_party.MPEG4CompressionCodec;
import tech.luigui.design_patterns.structural.facade.third_party.OggCompressionCodec;

public class VideoConverterTest {

  VideoConverter videoConverter = new VideoConverter();
  @Test
  void mpeg4Test() {
    File result = videoConverter.convert("test1", "mp4");
    Assertions.assertTrue(result.getRawFile().getDestinationCodec() instanceof MPEG4CompressionCodec);
  }

  @Test
  void elseTest() {
    File result = videoConverter.convert("test2", "else");
    Assertions.assertTrue(result.getRawFile().getDestinationCodec() instanceof OggCompressionCodec);
  }
}
