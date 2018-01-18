package com.codeup.springbootblog;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {


    @RequestMapping(path = "/add/{number}/and/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String add(@PathVariable int number,@PathVariable int number2) {
        return number + " plus " + number2 + " is " + (number + number2) + "!";
    }

    @RequestMapping(path = "/sub/{number}/and/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String sub(@PathVariable int number,@PathVariable int number2) {
        return number + " subtract " + number2 + " is " + (number - number2) + "!";
    }

    @RequestMapping(path = "/mult/{number}/and/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String mult(@PathVariable int number,@PathVariable int number2) {
        return number + " * " + number2 + " is " + (number * number2) + "!";
    }


    @RequestMapping(path = "/div/{number}/and/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String div(@PathVariable int number,@PathVariable int number2) {
        return number + " divided by " + number2 + " is " + (number % number2) + "!";
    }

}
