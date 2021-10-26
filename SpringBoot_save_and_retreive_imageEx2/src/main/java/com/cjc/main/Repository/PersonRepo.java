package com.cjc.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.Model.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person,Long>{

}
