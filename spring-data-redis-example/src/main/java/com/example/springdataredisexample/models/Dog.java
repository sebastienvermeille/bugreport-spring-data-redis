package com.example.springdataredisexample.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.TypeAlias;

@NoArgsConstructor
@AllArgsConstructor
@TypeAlias("Dog")
@Getter
@Setter
public class Dog extends Animal {

  private Integer postmanCounter;

}
