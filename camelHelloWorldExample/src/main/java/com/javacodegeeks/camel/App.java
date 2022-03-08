package com.javacodegeeks.camel;

import java.util.Scanner;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class App {
	public static void main(String args[]) throws Exception {
		CamelContext context = new DefaultCamelContext();
		context.addRoutes(new RouteBuilder() {
			public void configure() {
				//from("file:/home/francesco?noop=true").to("file:/home/camel");
				//from("file:C:\\datafiles\\input?noop=true").to("file:C:\\datafiles\\output");
				from("file:C:\\dev1?noop=true").to("file:C:\\dev2");
			}
		});
		context.start();
		System.out.println("Press enter to continue...");
		Scanner keyboard = new Scanner(System.in);
		keyboard.nextLine();
		context.stop();
	}
}
