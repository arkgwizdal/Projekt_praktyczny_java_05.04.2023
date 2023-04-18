package org.financeMennager.service;

import org.financeMennager.entity.Category;

public class CattegoryService {

    public void addCattegory(String name ){
        if (name != null){
            Category category = new Category();
            category.setCategoryName(name);

            System.out.println("Your cattegory : "+name + " was added");

        }
        else
        {System.err.println("Cattegory name cant be empty");}



    }

    public void deleteCattegory(String name) {
        if (name != null){
            Category category = new Category();
            category.setCategoryName(name);

            System.out.println("Your cattegory : "+name + " was added");

        }
        else
        {System.err.println("Cattegory name cant be empty");}
    }
}
