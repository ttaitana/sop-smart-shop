package com.BubbleTea.Shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@SpringBootApplication
public class ShopApplication {
	public static ArrayList<BubbleTea> ORDER = new ArrayList<BubbleTea>();
	public static void main(String[] args) {
		SpringApplication.run(ShopApplication.class, args);
	}

	@RequestMapping("/")
	String home() {
		return "Welcome to SOP Smart BubbleTea Shop!";
	}

	@RequestMapping("/shop")
	BubbleTeaMenu[] viewMenuList(){
		System.out.println("Welcome");
		return BubbleTeaFactory.viewMenuList();
	}

	@RequestMapping("/shop/order")
	BubbleTeaMenu viewMenu(){return  BubbleTeaFactory.viewMenu(1);}

}
