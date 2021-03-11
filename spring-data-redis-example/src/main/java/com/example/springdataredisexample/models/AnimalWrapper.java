package com.example.springdataredisexample.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.redis.core.RedisHash;

@Data
@NoArgsConstructor
@RedisHash("Animal")
@TypeAlias("Animal")
@ToString
@EqualsAndHashCode
public class AnimalWrapper {

  @Id
  @NonNull
  private String id;
  private Animal animal;

  @PersistenceConstructor
  public AnimalWrapper(final String id, final Animal animal) {
    this.id = id;
    this.animal = animal;
  }
}
