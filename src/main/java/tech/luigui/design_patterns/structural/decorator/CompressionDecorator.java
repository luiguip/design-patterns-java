package tech.luigui.design_patterns.structural.decorator;

public class CompressionDecorator extends DataSourceDecorator{

  public CompressionDecorator(DataSource dataSource) {
    super(dataSource);
  }

  @Override
  public String readData() {
    return "Compressed: " + super.readData();
  }

}
