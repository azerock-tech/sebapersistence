package tum.seba.persistences.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tum.seba.persistences.demo.entity.Shape;

@Repository
public interface ShapeRepository extends JpaRepository<Shape,Integer> {
}
