package com.osvaldo.model;


import io.quarkus.mongodb.panache.common.MongoEntity;
import org.bson.types.ObjectId;

@MongoEntity(collection = "Student")
public class Student  {
    public ObjectId id; // used by MongoDB for the _id field
    public String name;
    public double grade;
    public int active;

}
