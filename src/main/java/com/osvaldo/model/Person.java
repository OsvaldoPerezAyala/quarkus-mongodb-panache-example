package com.osvaldo.model;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import org.bson.codecs.pojo.annotations.BsonProperty;

import javax.transaction.Status;
import java.time.LocalDate;
import java.util.List;

public class Person extends PanacheMongoEntity {
    public String name;

    @BsonProperty("birth")
    public LocalDate birth;
    public Status status;

    public static Person findByName(String name) {
        return find("name", name).firstResult();
    }

    public static List<Person> findAlive() {
        return list("status", Status.STATUS_ACTIVE);
    }

    public static void deleteLoics() {
        delete("name", "Loïc");
    }
}