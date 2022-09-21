package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NumbersServlet")
public class NumbersServlet extends HttpServlet {
    public NumbersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         
		Scanner scanner = new Scanner(System.in);
		
		int number1 = Integer.parseInt(request.getParameter("num1"));
		int number2 = Integer.parseInt(request.getParameter("num2"));
		int result1;
		int result2;
		
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("Enter Your Choice");
		String choice = request.getParameter("operation");
		PrintWriter out = response.getWriter();
		
		switch (choice) {
		case "Add" :
			result1 = number1 + number2;
			out.println("Addition of " + number1 + " & " + number2 + " is " +result1);
			break;
			
		case "Subtract" :
			result2 = number1 - number2;
			out.println("Subtraction of " + number1 + " & " + number2 + " is " +result2);
			break;
			
		case "Multiply" :
			result1 = number1 * number2;
			out.println("Multiplication of " + number1 + " & " + number2 + " is " +result1);
			break;
			
		case "Divide" :
			result2 = number1 / number2;
			out.println("Division of " + number1 + " & " + number2 + " is " +result2);
			break;
			
		case "Modulus" :
			result2 = number1 % number2;
			out.println("Modulus of " + number1 + " & " + number2 + " is " +result2);
			break;
		}
		
	}

}
