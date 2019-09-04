package com.BubbleTea.Shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@SpringBootApplication
@RestController
public class ShopApplication {
	public static ArrayList<BubbleTea> ORDER = new ArrayList<BubbleTea>();
	public static void main(String[] args) {
		SpringApplication.run(ShopApplication.class, args);
	}

	@RequestMapping("/")
	public String home() {
		return "Welcome to SOP Smart BubbleTea Shop! \n" +
				"How to use this shop?\n" +
				"1. /shop to view all menu\n" +
				"2. /order(number of tea flavor)/(number of bubble type) to order tea eg./order1/1 \n" +
				"3. /vieworder to see all you order\n" +
				"4. /clearorder to reset order";
	}

	@RequestMapping("/shop")
	public BubbleTeaMenu[] viewMenuList(){
		System.out.println("Welcome");
		return BubbleTeaFactory.viewMenu();
	}

	@RequestMapping("/order{flavor}/{bubble}")
	@ResponseBody
	public ArrayList<BubbleTea> addOrder(@PathVariable int flavor, @PathVariable int bubble){
		System.out.println("Add order");
		ORDER.add(BubbleTeaFactory.addOrder(flavor, bubble));
		System.out.println(ORDER.get(0));
		return ORDER;
	}

	@RequestMapping("/vieworder")
	public ArrayList<BubbleTea> viewOrder(){
		return ORDER;
	}

	@RequestMapping("/clearorder")
	public String clear(){
		ORDER.clear();
		return "Order cleared";
	}

}
