package tech.luigui.design_patterns.creational.singleton;

public class Database {
  private static volatile Database database;

  private Database(){}

  public static Database getInstance() {
    Database result = Database.database;
    if(result != null)
      return result;
    synchronized (Database.class) {
      if (database == null) {
        database = new Database();
      }
      return database;
    }
  }

  public boolean query(String sql){
    try {
      Thread.sleep(100);
      System.out.println(sql);
      return true;
    } catch (InterruptedException e) {
      e.printStackTrace();
      return false;
    }
  }
}
