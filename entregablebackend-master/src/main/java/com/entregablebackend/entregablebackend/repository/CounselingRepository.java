package com.entregablebackend.entregablebackend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.entregablebackend.entregablebackend.entity.Counseling;

@RepositoryRestResource(collectionResourceRel = "counselings", path="counselings")
@CrossOrigin(origins="http://localhost:3000")
public interface CounselingRepository extends CrudRepository<Counseling, Long>{

}