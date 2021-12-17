package epsilon.teamEpsilon.controller;

import epsilon.teamEpsilon.Model.Product;
import epsilon.teamEpsilon.services.CSVReader;
import epsilon.teamEpsilon.services.SupplierToCentral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Controller
public class DataController {


    @Autowired
    CSVReader csvReader;
    @Autowired
    SupplierToCentral supplierToCentral;

    @GetMapping("")
    public String homePage(){
        return "home.html";
    }
    @PostMapping("/")
    public String hm(){
        return "home.html";
    }

    @GetMapping("login")
    public String homePage1(){
//        System.out.println("Came HEre !");
        return "login.html";
    }

    @GetMapping("loginS")
    public String homePage2(){
        return "loginS.html";
    }

    @GetMapping("/readCSV")
    public String readCSV(){
        ArrayList<Product> productArrayList = csvReader.read("/home/vaibhav.dubewar/Downloads/EPSILON.csv");
        supplierToCentral.addProductToCentral(productArrayList);
        return "login.html";
    }
}
