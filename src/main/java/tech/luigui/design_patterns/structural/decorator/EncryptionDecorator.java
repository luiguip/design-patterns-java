package tech.luigui.design_patterns.structural.decorator;

public class EncryptionDecorator extends DataSourceDecorator{

  public EncryptionDecorator(DataSource dataSource) {
    super(dataSource);
  }

  @Override
  public String readData() {
    return "Encrypted: " + super.readData();
  }
}
