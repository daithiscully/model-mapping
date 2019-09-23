package com.scully;

import com.scully.mappers.OrderMapper;
import com.scully.models.Address;
import com.scully.models.Customer;
import com.scully.models.Name;
import com.scully.models.Order;
import com.scully.models.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;

@Slf4j
public class Main {

  public static void main(String[] args) {
    ModelMapper modelMapper = new ModelMapper();
    modelMapper.addMappings(new OrderMapper());
    OrderDTO orderDTO = modelMapper.map(getOrder(), OrderDTO.class);
    log.info("OrderDTO: {}", orderDTO);
  }

  private static Order getOrder() {
    return Order.builder()
        .customer(getCustomer())
        .address(getAddress())
        .build();
  }

  private static Address getAddress() {
    return new Address("MyStreet", "MyCity");
  }

  private static Customer getCustomer() {
    Customer customer = new Customer();
    customer.setName(getName());
    return customer;
  }

  private static Name getName() {
    return new Name("Daithi", "Scully");
  }

}
