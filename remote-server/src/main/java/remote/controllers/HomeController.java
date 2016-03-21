package remote.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jean on 3/15/16.
 */
@RestController
public class HomeController {


    @RequestMapping("/")
    public String home(){


        for(int i=0; i < 999999; i++){

            if(i > 30000){
                i = 0;
            }
        }

        return "{\"value\": \"ok\"}";
    }


}
