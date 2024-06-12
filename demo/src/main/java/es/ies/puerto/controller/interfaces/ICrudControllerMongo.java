package es.ies.puerto.controller.interfaces;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ICrudControllerMongo <T>{
    List<T> getAllObjects();
    ResponseEntity<T> saveObject(T object);
    ResponseEntity<T> updateObject (String id, T object);
    ResponseEntity<Void> deleteObject(String id);
}
