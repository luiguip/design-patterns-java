package tech.luigui.design_patterns.structural.decorator;

public class FileDataSource implements DataSource{
  private String filename;
  private String data;

  public FileDataSource(String filename) {
    this.filename = filename;
  }

  @Override
  public void writeData(String data) {
    this.data = data;
  }

  @Override
  public String readData() {
    return "File: " + filename + "\nData: " + data;
  }
}
