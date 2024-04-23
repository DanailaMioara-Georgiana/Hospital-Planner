package org.example.Server.DataBase;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DataBaseEntity {

    private static EntityManagerFactory entityManagerFactory = null;

    private static EntityManager entityManager = null;

    private DataBaseEntity () {

    }

    public static void setEntityManager() {
        DataBaseEntity.entityManager = null;
    }

    public static EntityManager getEntityManager() {
        if (entityManager == null) {
            entityManagerFactory = Persistence.createEntityManagerFactory("x");
            entityManager = entityManagerFactory.createEntityManager();
        }
        return  entityManager;
    }
}
