package tum.seba.persistences.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import tum.seba.persistences.demo.entity.Circle;
import tum.seba.persistences.demo.entity.Shape;
import tum.seba.persistences.demo.service.ShapeService;

@SpringBootApplication
public class DemoApplication {

    @Autowired
    private ShapeService shapeService;


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void execCodeAfterStartup(){
        shapeService.saveShape(new Shape("red"));
        shapeService.saveShape(new Shape("blue"));
        shapeService.saveShape(new Shape("green"));
        shapeService.saveShape(new Shape("red"));
        shapeService.saveShape(new Circle("red",2));
    }

}
