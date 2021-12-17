package epsilon.teamEpsilon.services;

import epsilon.teamEpsilon.Model.Central;
import epsilon.teamEpsilon.Model.Product;
import epsilon.teamEpsilon.Repository.SuppToCen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class SupplierToCentral {
    @Autowired
    SuppToCen suppToCen;

    public void addProductToCentral(ArrayList<Product> list){
        for (Product p:list) {
            Central c = new Central(p.getPname(),p.getBname(),p.getCategory(),p.getQty(),p.getpPerq(),3);
            System.out.println("--------------------------------------------");
            System.out.println(c.getPname()+ "  "+c.getBname() + "  "+c.getCategory() + " ");
            suppToCen.save(c);
        }
    }
}
