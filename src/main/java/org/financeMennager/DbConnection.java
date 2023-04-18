package org.financeMennager;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.hibernate.type.internal.UserTypeSqlTypeAdapter;

public class DbConnection {

    private static final EntityManagerFactory entityMennagerFactory = Persistence.
            createEntityManagerFactory("finance-mennager");

    public static EntityManager getEntityMennager(){
        return entityMennagerFactory.createEntityManager();
    }

    public static void closeEntityMennagerFactory(){
        entityMennagerFactory.close();
    }



}
