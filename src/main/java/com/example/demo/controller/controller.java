package com.example.demo.controller;
import com.example.demo.bean.Count;
import com.example.demo.service.ResourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class controller {
    @Autowired
    ResourseService resourseService;
    @RequestMapping(value = "/me/count",method = RequestMethod.PUT)
    @ResponseBody
    public void initCount(@RequestBody Count count) {
        resourseService.initCount(count);
    }
    @RequestMapping(value = "/me/count", method = RequestMethod.POST)
    @ResponseBody
    public void modifyCount(@RequestBody Count count){
        resourseService.addCount(count);
    }

    @RequestMapping(value = "/me/count", method = RequestMethod.GET)
    @ResponseBody
    public  Count getCount() {
        return resourseService.getCount();
    }

}
