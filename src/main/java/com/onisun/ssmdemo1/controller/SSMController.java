package com.onisun.ssmdemo1.controller;

import com.onisun.ssmdemo1.bean.Emp;
import com.onisun.ssmdemo1.dao.EmpDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Neo
 * @version 1.0
 */
@Controller
public class SSMController {

    @Autowired
    private EmpDao empDao;

    @RequestMapping("/test")
    public String test(){
        System.out.println("test.........");
        Emp emp = empDao.getEmpByEmpno(7369);
        System.out.println(emp);
        return "success";
    }
}
