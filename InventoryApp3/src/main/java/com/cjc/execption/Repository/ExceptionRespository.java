package com.cjc.execption.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cjc.execption.model.Student;

public interface ExceptionRespository extends JpaRepository<Student, Integer> {

}
