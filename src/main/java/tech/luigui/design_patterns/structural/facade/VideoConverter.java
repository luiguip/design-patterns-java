package tech.luigui.design_patterns.structural.facade;

import tech.luigui.design_patterns.structural.facade.third_party.AudioMixer;
import tech.luigui.design_patterns.structural.facade.third_party.BitrateReader;
import tech.luigui.design_patterns.structural.facade.third_party.Buffer;
import tech.luigui.design_patterns.structural.facade.third_party.CodecFactory;
import tech.luigui.design_patterns.structural.facade.third_party.CompressionCodec;
import tech.luigui.design_patterns.structural.facade.third_party.File;
import tech.luigui.design_patterns.structural.facade.third_party.MPEG4CompressionCodec;
import tech.luigui.design_patterns.structural.facade.third_party.OggCompressionCodec;
import tech.luigui.design_patterns.structural.facade.third_party.RawFile;
import tech.luigui.design_patterns.structural.facade.third_party.SourceCodec;
import tech.luigui.design_patterns.structural.facade.third_party.VideoFile;

public class VideoConverter {

  File convert(String fileName, String format) {
    VideoFile file = new VideoFile(fileName);
    SourceCodec sourceCodec = CodecFactory.extract(file);
    CompressionCodec destinationCodec;
    if (format.equals("mp4")) {
      destinationCodec = new MPEG4CompressionCodec();
    } else {
      destinationCodec = new OggCompressionCodec();
    }
    Buffer buffer = BitrateReader.read(fileName, sourceCodec);
    RawFile rawResult = BitrateReader.convert(buffer, destinationCodec);
    RawFile finalResult = new AudioMixer().fix(rawResult);
    return new File(finalResult);
  }
}
