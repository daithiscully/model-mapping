package com.scully.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Order {

  Customer customer;
  Address address;
}
