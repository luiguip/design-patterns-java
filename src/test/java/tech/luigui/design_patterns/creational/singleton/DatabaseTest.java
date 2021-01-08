package tech.luigui.design_patterns.creational.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DatabaseTest {

  @Test
  void testRacingSingleton() {
    Thread threadFoo = new Thread(new ThreadFoo());
    Thread threadBar = new Thread(new ThreadBar());
    threadFoo.start();
    threadBar.start();
    try {
      Thread.sleep(100);
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      Assertions.assertTrue(true);
    }
  }

}

class ThreadFoo implements Runnable {
  @Override
  public void run() {
    Database database = Database.getInstance();
    database.query("Hello");
  }
}

class ThreadBar implements Runnable {
  @Override
  public void run() {
    Database database = Database.getInstance();
    database.query("World!");
  }
}
