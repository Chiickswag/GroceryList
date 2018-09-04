import java.sql.Array;
import java.util.ArrayList;

public class GroceryList {

    private String foodItems;
    private String paperProducts;
    private String cleaningProducts;
    private String groceryGiftCards;
    private String[] groceryLists = new String[10];


    public GroceryList() {
        groceryLists[1] = foodItems;
        groceryLists[2] = paperProducts;
        groceryLists[3] = cleaningProducts;
        groceryLists[4] = groceryGiftCards;




    }

    public GroceryList(String foodItems, String paperProducts, String cleaningProducts, String groceryGiftCards, String[] groceryLists) {
        this.foodItems = foodItems;
        this.paperProducts = paperProducts;
        this.cleaningProducts = cleaningProducts;
        this.groceryGiftCards = groceryGiftCards;
        this.groceryLists = groceryLists;
    }

    public String getFoodItems() {
        return foodItems;
    }

    public String getPaperProducts() {
        return paperProducts;
    }

    public String getCleaningProducts() {
        return cleaningProducts;
    }

    public String getGroceryGiftCards() {
        return groceryGiftCards;
    }

    public String[] getGroceryLists() {
        return groceryLists;
    }

    public void setFoodItems(String foodItems) {
        this.foodItems = foodItems;
    }

    public void setPaperProducts(String paperProducts) {
        this.paperProducts = paperProducts;
    }

    public void setCleaningProducts(String cleaningProducts) {
        this.cleaningProducts = cleaningProducts;
    }

    public void setGroceryGiftCards(String groceryGiftCards) {
        this.groceryGiftCards = groceryGiftCards;
    }

    public void setGroceryLists(String[] groceryLists) {
        this.groceryLists = groceryLists;
    }
}




