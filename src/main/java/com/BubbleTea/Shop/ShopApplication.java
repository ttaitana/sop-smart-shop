package com.BubbleTea.Shop;

import Storage.Storage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@SpringBootApplication
@RestController

public class ShopApplication {
	public static Storage store = new Storage();
	public static ArrayList<BubbleTea> ORDER;

	static {
		try {
			ORDER = store.loadFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//public static ArrayList<BubbleTea> ORDER = new ArrayList<BubbleTea>();
	public static void main(String[] args) {
		SpringApplication.run(ShopApplication.class, args);
	}

	@RequestMapping("/")
	public String home(){
		return "Welcome to SOP Smart BubbleTea Shop! \n" +
				"How to use this shop?\n" +
				"1. /shop to view all menu\n" +
				"2. /order(number of tea flavor)/(number of bubble type) to order tea eg./order1/1 \n" +
				"3. /vieworder to see all you order\n" +
				"4. /clearorder to reset order";
	}

	@RequestMapping(value = "/shop")
	public ResponseEntity<BubbleTeaMenu[]> viewMenuList(){
		System.out.println("Welcome");
		return new ResponseEntity<BubbleTeaMenu[]>(BubbleTeaFactory.viewMenu(), HttpStatus.OK);
	}

	@RequestMapping(value = "/order", method = RequestMethod.POST)
	public ResponseEntity<ArrayList<BubbleTea>> addOrder(@RequestBody BubbleTea boba) throws IOException {
		System.out.println("Add order");
		BubbleTea bb = boba;
		ORDER.add(boba);
		System.out.println(ORDER.get(0));
		store.saveFile(ORDER);
		return new ResponseEntity<ArrayList<BubbleTea>>(ORDER, HttpStatus.OK);
	}

	@RequestMapping(value = "/vieworder")
	public ResponseEntity<ArrayList<BubbleTea>> viewOrder(){
		return new ResponseEntity<ArrayList<BubbleTea>>(ORDER, HttpStatus.OK);
	}

	@RequestMapping(value = "/clearorder")
	public String clear(){
		ORDER.clear();
        store.saveFile(ORDER);
		return "Order cleared";
	}

}
