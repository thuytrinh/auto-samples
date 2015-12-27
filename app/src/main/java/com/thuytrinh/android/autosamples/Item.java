package com.thuytrinh.android.autosamples;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Item {
  public static Builder builder() {
    return new AutoValue_Item.Builder();
  }

  public abstract long id();
  public abstract String name();

  @AutoValue.Builder
  public static abstract class Builder {
    public abstract Builder id(long id);
    public abstract Builder name(String name);
    public abstract Item build();
  }
}