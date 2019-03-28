package com.ttn.thymeleaf.controllers;

import com.ttn.thymeleaf.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/")
public class TestController {

    //Question 1
    @GetMapping("showAlert")
    String show() {
        return "q1";
    }

    //Question 2
    @GetMapping("show")
    String showCss() {
        return "q2";
    }

    //Question 3
    @GetMapping("createUser")
    public ModelAndView create() {
        ModelAndView view = new ModelAndView("q3");
        view.addObject("employee", new Employee());
        return view;
    }

    //Question 4
    @PostMapping("saveEmployee")
    public ModelAndView saveStudent(@ModelAttribute Employee employee) {
        ModelAndView modelAndView = new ModelAndView("q4");
        modelAndView.addObject("employee", employee);
        return modelAndView;
    }

    //Question 5
    @GetMapping("userType")
    public String userType() {
        return "q5";
    }

    @PostMapping("type")
    public String type(HttpServletRequest request, Model model) {
        String type = request.getParameter("userType");
        model.addAttribute("isAdmin", type);
        return "greetings";
    }

    //Question 6
    @GetMapping("header")
    public String header() {
        return "q6";
    }

    //Question 7
    @GetMapping("getTime")
    public String getTime() {
        return "q7";
    }

    @GetMapping("saveDate")
    @ResponseBody
    public String saveDate() {
        Date date = new Date();
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        return sd.format(date);
    }

    //Question 8
    @GetMapping("users")
    public String fetchUserList(Model model) {
        List<Employee> employees = Arrays.asList(new Employee(21, "Ritesh"), new Employee(27, "Vishal"), new Employee(30, "Shivam"));
        model.addAttribute("employees", employees);
        return "q8";
    }

    //Question 9
    @GetMapping("competency")
    public String competency() {
        return "q9";
    }

    //Question 10
    @GetMapping("showLoader")
    public String showLoader(){
        return "q10";
    }

    @PostMapping("/registrationSubmit")
    @ResponseBody
    public String register(@ModelAttribute Employee employee){
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "Registered: "+employee.getName()+"<br/>";
    }

}
