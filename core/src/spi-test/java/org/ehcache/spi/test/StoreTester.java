package org.ehcache.spi.test;

import org.ehcache.spi.cache.Store;

public class StoreTester extends SPITester {

  final StoreFactory storeFactory;

  public StoreTester(final StoreFactory factory) {
    this.storeFactory = factory;
  }

  @SPITest
  public void test1() {
    System.out.println("running test1");
    final Store<String, String> store = storeFactory.newStore(String.class, String.class);
  }
  
  @SPITest
  public void test2() {
    System.out.println("running test2");
    final Store<Integer, String> store = storeFactory.newStore(Integer.class, String.class);
  }
  
  @SPITest
  public void test3() {
    System.out.println("running test3");
  }
}