package com.matveev.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showFirstView (){
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDelails(){
        return "ask-emp-details-view";
    }

//    @RequestMapping("/showDetails")
//    public String showEmpDelails(){
//        return "show-emp-details-view";
//    }

    @RequestMapping("/showDetails")
    public String showEmpDelails(HttpServletRequest request, Model model){
        String empName = request.getParameter("employeeName");
        empName = "Mr. " + empName;
        model.addAttribute("nameAttribute", empName);
        model.addAttribute("description", " - Udemy courses student");


        return "show-emp-details-view";
    }
}
