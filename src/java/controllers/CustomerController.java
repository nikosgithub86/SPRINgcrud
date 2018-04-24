package controllers;

import entities.Customer;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import services.CustomerService;

@RequestMapping("/customers")
@Controller
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    private String getAll(Model m) {
        m.addAttribute("clist", customerService.getAll());
        return "customers";
    }

    @RequestMapping(value = "/insert/{name}/{surname}", method = RequestMethod.GET)
    private String insert(Model m,
            @PathVariable("name") String name,
            @PathVariable("surname") String surname) {

        customerService.insert(
                new Customer(name, surname)
        );

        return getAll(m);
    }

    @RequestMapping(value = "/insert/someone", method = RequestMethod.POST)
    private String insertPost(Model m, HttpServletRequest request) {

        String name = request.getParameter("name");
        String surname = request.getParameter("surname");

        customerService.insert(
                new Customer(name, surname)
        );

        return getAll(m);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    private String insertPage() {

        return "insert";
    }
}
