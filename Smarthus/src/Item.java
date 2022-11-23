/**
 * This class represents an item in storage.
 * The class is a record which means it's an immutable class
 * which means the class attributes are final.
 */
public final class Item {
    private final String itemNumber;
    private final String itemDescription;
    private final String itemColor;
    private final int itemCategory;
    private int itemPrice;
    private String itemBrand;
    private double itemWeightInKg;
    private double itemLengthInCm;
    private double itemHeightInCm;
    private int itemAmountInStorage;

    /**
     * The constructor of the class which takes the items attributes and implements
     * them in this class. All the parameters will be final, except @param itemPrice.
     *
     * @param itemNumber          The item number
     * @param itemDescription     Description of the item
     * @param itemPrice           The itemPrice of the item
     * @param itemBrand           The items brand
     * @param itemWeightInKg      The items weight in kg
     * @param itemLengthInCm      The items length in cm
     * @param itemHeightInCm      The items itemHeightInCm in cm
     * @param itemColor           The items itemColor
     * @param itemAmountInStorage The items amount in storage
     * @param itemCategory        The items itemCategory
     */
    public Item(String itemNumber, String itemDescription, int itemPrice, String itemBrand, double itemWeightInKg, double itemLengthInCm, double itemHeightInCm, String itemColor, int itemAmountInStorage, int itemCategory) {
        this.itemNumber = itemNumber;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.itemBrand = itemBrand;
        this.itemWeightInKg = itemWeightInKg;
        this.itemLengthInCm = itemLengthInCm;
        this.itemHeightInCm = itemHeightInCm;
        this.itemColor = itemColor;
        this.itemAmountInStorage = itemAmountInStorage;
        this.itemCategory = itemCategory;
    }

    public void IncreaseItemAmountInStorage(int increase) {
        itemAmountInStorage += 1;
    }

    //Get methods
    public String toString() {
        return switch (getItemCategory()) {
            case 1 -> "Gulv";
            case 2 -> "Vinduer";
            case 3 -> "Dører";
            case 4 -> "Trelast";
            default -> "Wrong Input";
        };

    }

    public String getItemNumber() {
        return itemNumber;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }


    //Bruk enum på kategorier

    public String getItemBrand() {
        return itemBrand;
    }

    public void setItemBrand(String itemBrand) {
        this.itemBrand = itemBrand;
    }

    public double getItemWeightInKg() {
        return itemWeightInKg;
    }

    public void setItemWeightInKg(double itemWeightInKg) {
        this.itemWeightInKg = itemWeightInKg;
    }

    public double getItemLengthInCm() {
        return itemLengthInCm;
    }

    public void setItemLengthInCm(double itemLengthInCm) {
        this.itemLengthInCm = itemLengthInCm;
    }

    public double getItemHeightInCm() {
        return itemHeightInCm;
    }

    public void setItemHeightInCm(double itemHeightInCm) {
        this.itemHeightInCm = itemHeightInCm;
    }

    public String getItemColor() {
        return itemColor;
    }

    public int getItemAmountInStorage() {
        return itemAmountInStorage;
    }

    public int getItemCategory() {
        return itemCategory;
    }

    //rabatt metode. Bruk overload, hvis den har parameter så legger den til rabatt
}
