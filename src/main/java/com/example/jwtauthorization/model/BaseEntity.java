package com.example.jwtauthorization.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.annotations.Expose;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "created_on",updatable = false)
    @CreationTimestamp
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Africa/Kigali")
    public Date createdOn;
    @Column(name = "softDelete", columnDefinition = "char(1) default 0")
    @JsonIgnore
//    field will be ignored upon deserialization
    @Expose(serialize = false)
    public boolean softDelete;
//    In this case, the column is defined as a character data type of length 1, with a default value of "1". The "char(1)" syntax specifies the length of the character data type, which means that the column will be able to store a single character. The "default 1" part specifies that if no value is provided for this column when a new record is inserted, the default value of "1" will be used.
    @Column(name = "active", columnDefinition = "char(1) default 1")
    private  boolean active;
//    "@PrePersist" is a JPA (Java Persistence API) annotation used in Java to specify a method that should be executed before a new entity is persisted to the database.
  @PrePersist
  public void addData() {
      ZonedDateTime zonedDateTime = ZonedDateTime.now();
      ZoneId zoneId = ZoneId.of("Africa/Kigali");
      ZonedDateTime nairobi = zonedDateTime.withZoneSameInstant(zoneId);
      this.createdOn = Date.from (nairobi.toInstant ());
      this.softDelete = false;
  }
}
