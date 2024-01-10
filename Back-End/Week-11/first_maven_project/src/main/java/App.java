import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("market");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        //Add Customer
        Customer customer = new Customer();
        customer.setName("Atacan Erdogan");
        customer.setGender(Customer.GENDER.MALE);
        customer.setMail("ae@sirket.com");
        customer.setOnDate(LocalDate.now());
        entityManager.persist(customer);
        //Supplier ekleme
        Suppliers supplier = new Suppliers();
        supplier.setAddress("Adres");
        supplier.setCompany("Şirket");
        supplier.setContact("5555555555");
        supplier.setMail("info@sirket.com");
        supplier.setPerson("Batuhan");
        entityManager.persist(supplier);

        //Category Ekleme
        Category category = new Category();
        category.setName("Phone");
        entityManager.persist(category);

        //Code Ekleme
        Code code = new Code();
        code.setGroup("111");
        code.setSerial("222");
        entityManager.persist(code);

        //Color ekleme
        Color color1 = new Color();
        color1.setName("Red");
        Color color2 = new Color();
        color2.setName("Black");
        Color color3 = new Color();
        color3.setName("White");

        entityManager.persist(color1);
        entityManager.persist(color2);
        entityManager.persist(color3);

        //Ürün ekleme
        Product product = new Product();
        product.setName("Iphone 15");
        product.setPrice(50000);
        product.setStock(100);
        product.setCode(code);
        product.setSupplier(supplier);
        product.setCategory(category);
        List<Color> colorList = new ArrayList<>();
        colorList.add(color1);
        colorList.add(color3);
        product.setColorList(colorList);
        entityManager.persist(product);
        transaction.commit();

/*
        //Add Customer
//        Customer customer =new Customer();
//        customer.setName("Atacan Erdogan");
//        customer.setGender(Customer.GENDER.MALE);
//        customer.setMail("ae@rich.com");
//        customer.setOnDate(LocalDate.now());
//        entityManager.persist(customer);

//        Add Code
        Code code= new Code();
        code.setGroup("11123");
        code.setSerial("44456");
        entityManager.persist(code);

        Product product = new Product();
        product.setName("Samsung Galaxy S15");
        product.setPrice(123);
        product.setStock(1323);
        product.setCode(code);
        product.setSuppliers(suppliers);
        entityManager.persist(product);
*/

//        //Add Suppliers
//
//        Suppliers supplier= new Suppliers();
//        supplier.setAddress("Adres");
//        supplier.setCompany("Patika");
//        supplier.setContact("5001231212");
//        supplier.setMail("info@ae.dev");
//        supplier.setPerson("Atacan Erdogan");
//        entityManager.persist(supplier);
//
//        //Add Category
//        Category category =new Category();
//        category.setName("Telefonlar");
//        entityManager.persist(category);
//
//        //Add Code
//        Code code= new Code();
//        code.setGroup("11123");
//        code.setSerial("44456");
//        entityManager.persist(code);
//
//        //Add Product
//        Product product = new Product();
//        product.setName("Iphone 16 Pro MAX");
//        product.setPrice(60000);
//        product.setStock(15);
//        product.setCode(code);
//        product.setSuppliers(supplier);
//        product.setCategory(category);
//        entityManager.persist(product);
//
//        System.out.println(product.toString());
//
//        //Add Color
//
//        Color blue = new Color("blue");
//        Color red = new Color("red");
//        Color yellow = new Color("yellow");
//
//        entityManager.persist(blue);
//        entityManager.persist(red);
//        entityManager.persist(yellow);
//
//        Product product1= entityManager.find(Product.class,1);
//        List<Color> colorList = new ArrayList<>();
//        colorList.add(blue);
//        colorList.add(red);
//        product1.setColorList(colorList);
//
//        entityManager.persist(product);

//        Remove

//        transaction.begin();
//        Customer customer = entityManager.find(Customer.class,1);
//        entityManager.remove(customer);
//        transaction.commit();


//        Update

//        transaction.begin();
//        Customer customer = entityManager.find(Customer.class,1);
//        customer.setName("Osman");
//        entityManager.persist(customer);
//        transaction.commit();


//        Yeni bir customer eklemek.

//        transaction.begin();
//        Customer customer = new Customer();
//
//        customer.setName("Sinan");
//        customer.setMail("sk@hotmail.com");
//        customer.setGender(Customer.GENDER.MALE);
//        customer.setOnDate(LocalDate.now());
//        entityManager.persist(customer);
//        transaction.commit();

//        Eklenilen customerı göstermek.

//        Customer customer = entityManager.find(Customer.class,1);
//        System.out.println(customer.toString());

//        @OneToOne

//        transaction.begin();
//        Code code= new Code();
//        code.setGroup("11123");
//        code.setSerial("44456");
//        entityManager.persist(code);
//
//        Product product = new Product();
//        product.setName("Iphone 15 Pro MAX");
//        product.setPrice(60000);
//        product.setStock(15);
//        product.setCode(code);
//
//        entityManager.persist(product);
//        System.out.println(product.toString());
//
//        transaction.commit();


    }
}
