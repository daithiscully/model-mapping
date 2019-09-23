package com.scully.models;

import lombok.Data;

@Data
public class OrderDTO {
  String customerFirstName;
  String customerLastName;
  String billingStreet;
  String billingCity;
}