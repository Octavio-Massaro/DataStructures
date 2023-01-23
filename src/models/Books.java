/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Octavio
 */
public class Books {
    
    private int id;
    private String Title;
    private String Category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public Books(int id, String Title, String Category) {
        this.id = id;
        this.Title = Title;
        this.Category = Category;
    }

    @Override
    public String toString() {
        return "Books{" + "id=" + id + ", Title=" + Title + ", Category=" + Category + '}';
    }
           
    
            
}
