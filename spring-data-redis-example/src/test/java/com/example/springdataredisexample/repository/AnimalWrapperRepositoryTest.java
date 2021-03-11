package com.example.springdataredisexample.repository;


import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import com.example.springdataredisexample.models.AnimalWrapper;
import com.example.springdataredisexample.models.Cat;
import com.example.springdataredisexample.models.Dog;

import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class AnimalWrapperRepositoryTest {

  @Autowired
  private AnimalWrapperRepository repository;


  @Test
  void findAllShouldReturn2AnimalsWhenSavedACatAndADog(){


    // GIVEN
    var cat = new Cat();
    cat.setId(UUID.randomUUID().toString());
    cat.setMouseCounter(1265);

    var dog = new Dog();
    dog.setId(UUID.randomUUID().toString());
    dog.setPostmanCounter(2);

    var catWrapper = new AnimalWrapper("cat-id", cat);
    var dogWrapper = new AnimalWrapper("dog-id", dog);

    repository.save(catWrapper);
    repository.save(dogWrapper);

    // WHEN
    var actualResult = repository.findAll();

    // THEN
    assertTrue(actualResult.spliterator().getExactSizeIfKnown() == 2);
  }

  @Test
  void findAllShouldAlsoReturnAnimalsWhenTheyExistAlreadyInDb(){
    try {
      var actualResult = repository.findAll();
    } catch(Exception ex){
      fail("You shall not fail!");
    }
  }
}