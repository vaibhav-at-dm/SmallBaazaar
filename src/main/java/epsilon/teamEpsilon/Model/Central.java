package epsilon.teamEpsilon.Model;

import javax.persistence.*;


@Entity(name = "central")
@Table(name="central")
public class Central {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pid")
    int pid;
    @Column(name = "pname")
    String pname;
    @Column(name = "bname")
    String bname;
    @Column(name = "category")
    String category;
    @Column(name = "qty")
    int qty;
    @Column(name = "pPerq")
    double pPerq;
    @Column(name = "sid")
    int sid;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

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

    public double getpPerq() {
        return pPerq;
    }

    public void setpPerq(double pPerq) {
        this.pPerq = pPerq;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public Central(String pname, String bname, String category, int qty, double pPerq, int sid) {
        this.pid = pid;
        this.pname = pname;
        this.bname = bname;
        this.category = category;
        this.qty = qty;
        this.pPerq = pPerq;
        this.sid = sid;
    }
//    public Central( String pname, String bname, String category, int qty, double pPerq,int sid) {
//        this.pid = pid;
//        this.pname = pname;
//        this.bname = bname;
//        this.category = category;
//        this.qty = qty;
//        this.pPerq = pPerq;
//        this.sid = sid;
//    }
    public Central(){}
}
