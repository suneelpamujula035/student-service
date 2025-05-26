package com.student.resource;

import com.student.entity.Student;
import com.student.repository.StudentRepository;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Path("/students")
public class StudentResource {

    @Autowired
    private StudentRepository studentRepository;

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/getAllStudents")
    public List<Student> getAllStudents()
    {
        return studentRepository.findAll();
    }
}
