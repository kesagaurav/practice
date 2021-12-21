package com.gaurav.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

import com.gaurav.model.product.Product;
import com.gaurav.productException.ProductNotFoundException;
import com.gaurav.service.ProductService;
import com.gaurav.service.impl.ProductServiceImpl;

public class ProductMain {

	public static void main(String[] args)
			throws IOException, ClassNotFoundException, FileNotFoundException, Exception {
		Product p = new Product();
		Scanner sc = new Scanner(System.in);
		ProductServiceImpl ps = new ProductServiceImpl();
		List<Product> li = new ArrayList<>();
		li.add(new Product(101, "TV", 50, 99999));
		li.add(new Product(102, "Laptop", 20, 59999));
		li.add(new Product(103, "Mobile", 60, 20000));
		li.add(new Product(104, "IPad", 30, 40000));
		System.out.println("\n " + li);
		FileOutputStream fos = new FileOutputStream(
				"C:\\java programs by vinay sir practice\\SerizablePractice\\gaurav.ser");
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(p);
		//System.out.println("\n please enter the id");
		System.out.println("\n please enter an id ");
		li.stream().filter(e->e.getId()==sc.nextInt()).mapToDouble(e -> e.getPrice()).forEach(e -> System.out.println(" the price is " + e));

		fos.close();
		os.close();

		FileInputStream fis = new FileInputStream(
				"C:\\java programs by vinay sir practice\\SerizablePractice\\gaurav.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Product> li2 = (List<Product>) ois.readObject();
		System.out.println("\n printing the elments are");
		li2.forEach(System.out::println);
		fis.close();
		ois.close();

	}

}
