package org.ribatis.RibatisService.repository;

import org.ribatis.RibatisService.entities.Ribatis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RibatisRepository extends JpaRepository<Ribatis,Long> {
}
