package pizzashop.model;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class MenuDataModel {
    private final SimpleStringProperty menuItem;
    private final SimpleDoubleProperty price;

    public MenuDataModel(String mItem, Double mPrice) {
        this.menuItem = new SimpleStringProperty(mItem);
        this.price = new SimpleDoubleProperty(mPrice);
    }

    public String getMenuItem() {
        return menuItem.get();
    }

    public SimpleStringProperty menuItemProperty() {
        return menuItem;
    }

    public void setMenuItem(String menuItem) {
        this.menuItem.set(menuItem);
    }

    public Double getPrice() {
        return price.get();
    }

    public SimpleDoubleProperty priceProperty() {
        return price;
    }

    public void setPrice(Double price) {
        this.price.set(price);
    }
}
