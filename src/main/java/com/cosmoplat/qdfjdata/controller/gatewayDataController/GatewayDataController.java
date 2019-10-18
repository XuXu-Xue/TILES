package com.cosmoplat.qdfjdata.controller.gatewayDataController;


import com.cosmoplat.qdfjdata.controller.utils.ExecuteResult;
import com.cosmoplat.qdfjdata.service.GatewayDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/gateway")
public class GatewayDataController {

    @Autowired
    private GatewayDataService gatewayDataService;

    @RequestMapping("/getData")
    @ResponseBody
    public ExecuteResult<String> getData(){
        return gatewayDataService.getdata();
    }
}
