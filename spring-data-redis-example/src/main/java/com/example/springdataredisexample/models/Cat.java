package com.example.springdataredisexample.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.TypeAlias;

@NoArgsConstructor
@AllArgsConstructor
@TypeAlias("Cat")
@Getter
@Setter
public class Cat extends Animal {

  private Integer mouseCounter;

}
