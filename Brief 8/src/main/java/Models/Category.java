package Models;

public class Category {

    private int ID_Category;
    private String Name;


    public int getID_Category() {
        return ID_Category;
    }
    public void setID_Category(int iD_Category) {
        ID_Category = iD_Category;
    }

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }


    public Category() {}
    public Category(int iD_Category, String name) {
        ID_Category = iD_Category;
        Name = name;
    }


    @Override
    public String toString() {
        return "Category [ID_Category=" + ID_Category + ", Name=" + Name + "]";
    }


}
