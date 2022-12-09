package model;

import lombok.Builder;
import lombok.ToString;

import java.io.Serializable;

@Builder
@ToString
public class Person implements Serializable {

  private int id;
  private String name;
  private int age;
  private Car car;

}
