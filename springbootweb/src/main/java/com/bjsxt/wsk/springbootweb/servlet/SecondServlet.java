package com.bjsxt.wsk.springbootweb.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("SecondServlet.doGet+two");
    }
}
