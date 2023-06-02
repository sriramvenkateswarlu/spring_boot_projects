package com.example.demo.BindingClass;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class User {
   private Integer id;
   private String name;
   private double price;
   
}
