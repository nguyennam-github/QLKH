/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hvan.qlkh.dao;

import hvan.qlkh.models.Product;
import hvan.qlkh.models.ProductList;
import hvan.qlkh.services.ProductServices;
import hvan.qlkh.utils.FileUtils;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public final class ProductDAO {

    private static final String XMLFILE_PATH = "product.xml";
    private List<Product> products;
    private static ProductDAO instance;

    private ProductDAO() {
        this.readProducts();
    }

    public static synchronized ProductDAO getInstance(){
        if(instance == null){
            instance = new ProductDAO();
        }
        return instance;
    }

    public void writeProducts() {
        ProductList pl = ProductList.getInstance();
        pl.setProducts(products);
        FileUtils.writeXMLtoFile(XMLFILE_PATH, pl);
    }

    public List<Product> readProducts() {
        if (products == null){
            products = new ArrayList<>();
            ProductList pl = (ProductList) FileUtils.readXMLFile(XMLFILE_PATH, ProductList.class);
            if (pl != null &&  (pl.getProducts() != null)) {
                products = pl.getProducts();
            }
        }
        return products;
    }

    public void create(Product product) {
        products.add(product);
        writeProducts();
    }
    
    public Product update(String id, Product product){
        Product temp = null;
        for (Product p: products){
            if (p.getId().equals(id)){
                p.setId(product.getId());
                p.setName(product.getName());
                p.setCategory(product.getCategory());
                p.setQuantity(product.getQuantity());
                p.setPrice(product.getPrice());
                p.setExpDate(product.getExpDate());
                p.setManafacturer(product.getManafacturer());
                p.setThumbnail(product.getThumbnail());
                p.setDescription(product.getDescription());
                temp = p;
                writeProducts();
                break;
            }
        }
        return temp;
    }
    
    public boolean delete(String id) {
        Product product = ProductServices.getInstance().findById(id);
        if (product != null) {
            products.remove(product);
            writeProducts();
            return true;
        }
        return false;
    }
}
