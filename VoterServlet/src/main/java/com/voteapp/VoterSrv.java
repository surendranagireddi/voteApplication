package com.voteapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VoterSrv extends HttpServlet{
	
	protected void process(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		System.out.println("VoterSrv : process(-,-)");
		//general settings
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
	   //read form data given by form page
		String name =req.getParameter("pname");
		String tage= req.getParameter("page").trim();
		int age = Integer.parseInt(tage);
		
		//Write a logic
		if(age>=18) {
			pw.println("<h1><font color='cyan'>"+name+"you are eligible to vote");
		}else {
			pw.println("<h1><font color='brown'>"+name+"you are not eligible to vote");
		}
		
	   //add graphical link
		pw.println("<a href='input.html'><img src='vote.jpg'></a>");
		//close Stream
		pw.close();
	}
	
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		System.out.println("VoterSrv:doGet(-,-)");
		
		process(req,res);
	}
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		System.out.println("VoterSrv:doGet(-,-)");
		
		process(req,res);
	}
	
	
	
	

		
	}
	
	


