package controller;

import domain.Account;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import service.impl.AccountServiceImpl;


@Controller
public class Homecontroller {
    @Autowired
    private AccountServiceImpl accountService;

    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute(new Account());
        return "home";
    }

    @RequestMapping("login")
    public String login(Model model, Account account){
        if(account!=null){
            model.addAttribute(accountService.account(account.getNumber()));
            return "login";
        }else {
            return "home";
        }
    }

    @RequestMapping("update")
    public String update(Model model){

        return "login";
    }

}
