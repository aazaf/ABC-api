package lk.abc.controller;

import lk.abc.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
 @CrossOrigin
public class AdminController {

    @Autowired
    private AdminService adminService;

}
