package tum.seba.persistences.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tum.seba.persistences.demo.entity.Shape;
import tum.seba.persistences.demo.repository.ShapeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ShapeService {

    @Autowired
    private ShapeRepository shapeRepository;

    public Shape saveShape(Shape shape){
        return shapeRepository.save(shape);
    }

    public List<Shape> findAllShapes() {
        return shapeRepository.findAll();

    }
    public Shape findShapeById(int shapeId) {
        Optional<Shape> foundShape = shapeRepository.findById(shapeId);
        if (foundShape.isPresent()) {return foundShape.get();}
        else {return null;}
    }
    public void deleteShapeById(int shapeId){
        shapeRepository.deleteById(shapeId);
    }
}
