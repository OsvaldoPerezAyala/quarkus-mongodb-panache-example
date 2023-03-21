package com.osvaldo;


import com.osvaldo.model.Person;
import com.osvaldo.model.Student;
import com.osvaldo.repository.StudentRepository;
import org.bson.types.ObjectId;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;

@Path("/students")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class StudentController {


    @Inject
    StudentRepository studentRepository;

    @Path("/count")
    @GET
    public long countStudent() {
        return studentRepository.count();
    }

    @GET
    @Path("/search/{name}")
    public Student search(String name) {
        return studentRepository.findByName(name);
    }


    @POST
    public Response create(Student student) {
        studentRepository.persist(student);
        return Response.created(URI.create("/persons/" + student.id)).build();
    }

}
