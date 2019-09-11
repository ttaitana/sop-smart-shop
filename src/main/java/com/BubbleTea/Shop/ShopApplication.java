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
	@ResponseBody
	public String home(){
		return "Welcome to SOP Smart BubbleTea Shop! \n" +
				"How to use this shop?\n" +
				"1. /shop to view all menu and number of flavor and bubble\n" +
				"2. /order(number of tea flavor)/(number of bubble type) \n" +
				"to order bubble tea use 'teaFlavor' to select flavor (number)\n" +
				"and use 'bubbleType' to select type of bubble (number)\n" +
				"3. /vieworder to see all you order\n" +
				"4. /cancel/'NO.of order' to cancel order which you select\n" +
				"ex. cancel/1 will cancel your first order\n" +
				"if you enter number that more than your order or number < 1 with command wil do nothing" +
				"5. /clearorder to cancel all order";
	}

	@RequestMapping(value = "/shop")
	@ResponseBody
	public ResponseEntity<BubbleTeaMenu[]> viewMenuList(){
		System.out.println("Welcome");
		return new ResponseEntity<BubbleTeaMenu[]>(BubbleTeaFactory.viewMenu(), HttpStatus.OK);
	}

	@RequestMapping(value = "/order", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<ArrayList<BubbleTea>> addOrder(@RequestBody BubbleTea boba) throws IOException {
		System.out.println("Add order");
		BubbleTea bb = boba;
		ORDER.add(boba);
		System.out.println(ORDER.get(0));
		store.saveFile(ORDER);
		return new ResponseEntity<ArrayList<BubbleTea>>(ORDER, HttpStatus.OK);
	}

	@RequestMapping(value = "/vieworder")
	@ResponseBody
	public ResponseEntity<ArrayList<BubbleTea>> viewOrder(){
		return new ResponseEntity<ArrayList<BubbleTea>>(ORDER, HttpStatus.OK);
	}

	@RequestMapping(value = "/clearorder")
	@ResponseBody
	public String clear(){
		ORDER.clear();
        store.saveFile(ORDER);
		return "Order cleared";
	}
	@RequestMapping(value="cancel/{order}")
	@ResponseBody
	public ResponseEntity<ArrayList<BubbleTea>> cancel(@PathVariable int order){
		if(order > ORDER.size() || order < 1){
			return new ResponseEntity<ArrayList<BubbleTea>>(ORDER, HttpStatus.OK);
		}
		ORDER.remove(order-1);
		store.saveFile(ORDER);
		return new ResponseEntity<ArrayList<BubbleTea>>(ORDER, HttpStatus.OK);
	}

}
