package es.ies.puerto.service.interfaces;

import java.util.List;

public interface ICrudServiceMongoDb<T> {
    List<T> getAllObjects();
    T saveObject(T object);
    T updateObject(T object);
    void deleteObject(String id);
}
