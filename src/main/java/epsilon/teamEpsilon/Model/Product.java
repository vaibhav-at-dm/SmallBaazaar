package epsilon.teamEpsilon.Model;


import javax.persistence.*;

@Entity(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "serialNum")
    int serialNum;
    @Column(name = "pname")
    String pname;
    @Column(name = "bname")
    String bname;
    @Column(name = "category")
    String category;
    @Column(name = "qty")
    int qty;
    @Column(name = "pPerq")
    int pPerq;

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getpPerq() {
        return pPerq;
    }

    public void setpPerq(int pPerq) {
        this.pPerq = pPerq;
    }

    public Product(String pname, String bname, String category, int qty, int pPerq) {
        this.pname = pname;
        this.bname = bname;
        this.category = category;
        this.qty = qty;
        this.pPerq = pPerq;
    }
    public Product(){}
}
