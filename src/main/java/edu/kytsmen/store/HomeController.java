package edu.kytsmen.store;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by dkytsmen on 14.12.16.
 */
@Controller
@Log4j
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        logger.info("Redirect to home page");
        return "home";
    }
}
