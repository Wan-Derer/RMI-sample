package model;

import lombok.Builder;
import lombok.ToString;

import java.io.Serializable;

@Builder
@ToString
public class Car implements Serializable {
  private int id;
  private String brandName;
  private String model;

}
