package com.osvaldo.repository;

import com.osvaldo.model.Student;
import io.quarkus.mongodb.panache.PanacheMongoRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class StudentRepository implements PanacheMongoRepository<Student> {

    public Student findByName(String name){
        return find("name", name).firstResult();
    }

    public List<Student> findAlive(){
        return list("status",1);
    }

    public void deleteLoics(){
        delete("name", "Loïc");
    }
}
