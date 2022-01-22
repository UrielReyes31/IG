package uia.com.api.mvc.apimvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RequestWrapper;

@Controller
public class IndexController {
   // /SameReturnValue/
    @RequestMapping(value =  "/", method = RequestMethod.GET)
    @ResponseBody
    public String showIndex(){return "hola uia 11..";}

}
