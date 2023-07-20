package com.entregablebackend.entregablebackend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.entregablebackend.entregablebackend.entity.Advisor;

@RepositoryRestResource(collectionResourceRel = "advisors", path="advisors")
@CrossOrigin(origins="http://localhost:3000")
public interface AdvisorRepository extends CrudRepository<Advisor, Long>{

}