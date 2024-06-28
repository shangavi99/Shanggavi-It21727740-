package Controller;



import Model.Supplier;

public class SupplierController {

    Supplier SupplierObj;

    public Supplier addWatch(String SID, String SupplierName, String Item) {
        SupplierObj = new Supplier(SID, SupplierName, Item);
        return SupplierObj;
    }
}
