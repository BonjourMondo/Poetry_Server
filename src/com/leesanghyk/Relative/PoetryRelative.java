package com.leesanghyk.Relative;

import com.leesanghyk.DBUtils.RemoteTransfer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/*用于控制器可用性的测试类*/
@Controller
@RequestMapping("/poetryrelative")
public class PoetryRelative {

    @RequestMapping(value = "/get_poetry_info",method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    public @ResponseBody
    String getPoetyInfo(@RequestBody String sql){
        return RemoteTransfer.getPoetyInfo(sql,"title","poetries_content","name");
    }

}
