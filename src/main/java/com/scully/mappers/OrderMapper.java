package com.scully.mappers;

import com.scully.models.Order;
import com.scully.models.OrderDTO;
import org.modelmapper.PropertyMap;

public class OrderMapper extends PropertyMap<Order, OrderDTO> {

  protected void configure() {
    map().setCustomerFirstName(source.getCustomer().getName().getFirstName());
    map().setCustomerLastName(source.getCustomer().getName().getLastName());
    map().setBillingCity(source.getAddress().getCity());
    map().setBillingStreet(source.getAddress().getStreet());
  }

}
