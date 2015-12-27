package com.thuytrinh.android.autosamples;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ItemTest {
  @Test public void creation() {
    final int id = 1234;
    final String name = "Foo";
    final Item item = Item.builder().id(id).name(name).build();
    assertThat(item.id()).isEqualTo(id);
    assertThat(item.name()).isEqualTo(name);
  }
}