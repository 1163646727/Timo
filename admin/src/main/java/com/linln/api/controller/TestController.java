package com.linln.api.controller;

import com.linln.common.vo.ResultVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: TestController
 * @Description:
 * @Auther: Chenqi
 * @Date: 2019/4/20 15:57
 * @Version 1.0 jdk1.8
 */
@Controller
@RequestMapping("/api")
public class TestController {

    /**
     * 跳转到添加页面
     */
    @GetMapping({"/test"})
    @ResponseBody
    public ResultVo toAdd(String name) {
        ResultVo resultVo = new ResultVo();

        System.out.println("name="+name);
        System.out.println("测试-------------------------");
        Map map = new HashMap<>();
        map.put("name",name);

        resultVo.setMsg("");
        resultVo.setCode(1);
        resultVo.setData(map);
        return resultVo;
    }
}
