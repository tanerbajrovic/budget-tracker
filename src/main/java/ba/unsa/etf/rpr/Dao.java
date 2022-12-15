package ba.unsa.etf.rpr;

import java.util.List;

/**
 * Generic interface for all abstract classes
 * @author Taner Bajrovic
 * */
public interface AbstractDao<T> {

    /**
     * Gets entity from the database based
     * on entity's ID.
     * @param id Primary key of entity
     * @return Entity from the database
     */
    T getById(int id);

    /**
     * Adds entity into the database.
     * @param item Item to be added to the database
     * @return Saved entity with its ID field populated.
     */
    T add(T item);

    /**
     * Updates a database entity based on the ID (primary key)
     * match.
     * @param item Item to be updated in the database
     * @return Updated version of entity from the database
     */
    T update(T item);

    /**
     * Deletes an entity given by ID (primary key) from the database.
     * @param id Primary key of an entity
     */
    void delete(int id);

    /**
     * Returns a {@link java.util.List List} of all entities from the database.
     * @return {@link java.util.List List} of entities from the database
     */
    List<T> getAll();

}
