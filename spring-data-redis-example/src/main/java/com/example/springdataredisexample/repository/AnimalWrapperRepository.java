package com.example.springdataredisexample.repository;

import com.example.springdataredisexample.models.AnimalWrapper;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalWrapperRepository extends CrudRepository<AnimalWrapper, String> {
}

