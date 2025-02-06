package com.example.demo;

import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

@Repository
public class DatabaseRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<String> getAllTables() {
        return entityManager.createNativeQuery(
                "SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_TYPE = 'BASE TABLE'")
                .getResultList();
    }
}
