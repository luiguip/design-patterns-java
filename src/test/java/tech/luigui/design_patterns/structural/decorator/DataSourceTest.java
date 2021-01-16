package tech.luigui.design_patterns.structural.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DataSourceTest {

  @Test
  void fileDataSourceTest(){
    DataSource dataSource = new FileDataSource("nameOfFile");
    dataSource.writeData("dataOfFile");
    assertEquals("file: nameOfFile\ndata: dataOfFile", dataSource.readData());
  }

  @Test
  void encryptionDataSourceTest(){
    DataSource dataSource = new DataSourceDecorator(new EncryptionDecorator(new FileDataSource("nameOfFile")));
    dataSource.writeData("encryptedData");
    assertEquals("Encrypted: File: nameOfFile\nData: encryptedData", dataSource.readData());
  }

  @Test
  void compressionDataSourceTest(){
    DataSource dataSource = new DataSourceDecorator(new CompressionDecorator(new FileDataSource("nameOfFile")));
    dataSource.writeData("compressedData");
    assertEquals("Compressed: File: nameOfFile\nData: compressedData", dataSource.readData());
  }
}
