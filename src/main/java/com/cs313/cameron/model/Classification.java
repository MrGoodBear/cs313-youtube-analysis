
package com.cs313.cameron.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Classification implements Serializable {

  private static final long serialVersionUID = -1466033265848950587L;
  @SerializedName("className")
  @Expose
  private String className;
  @SerializedName("p")
  @Expose
  private Float p;

  /** No args constructor for use in serialization */
  public Classification() {}

  public Classification(String className, Float p) {
    super();
    this.className = className;
    this.p = p;
  }

  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public Classification withClassName(String className) {
    this.className = className;
    return this;
  }

  public Float getP() {
    return p;
  }

  public void setP(Float p) {
    this.p = p;
  }

  public Classification withP(Float p) {
    this.p = p;
    return this;
  }
}
