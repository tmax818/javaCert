package co.tylermaxwell.daikichipathvariables.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
    
        @RequestMapping("")
    public String welcome(){
        return "Welcome!";
    }

    @RequestMapping("/today")
    public String today(){
        return "Today you will find luck in all your endeavors!";
    }

    @RequestMapping("/tomorrow")
    public String tomorrow(){
        return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
    }

    @RequestMapping("travel/{dest}")
    public String travel(@PathVariable String dest){
        return String.format("Congratulations! You will soon travel to %s!", dest);
    }

    @RequestMapping("lotto/{num}")
    public String lotto(@PathVariable Integer num){
        System.out.println(num);
        String evenMssg = "You will take a grand journey in the near future, but be weary of tempting offers";
        String oddMssg = "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
        String message = num % 2 == 0 ? evenMssg : oddMssg;
        return message;
    }
}
