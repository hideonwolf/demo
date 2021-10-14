package com.example.demo.service;

import com.example.demo.bean.Count;
import com.example.demo.manager.ResourseManager;
import org.springframework.stereotype.Service;

import java.awt.*;
@Service
public class ResourseService {

    public void initCount(Count count) {
        if (count != null){
            ResourseManager.getInstance().addCount(count.getCount());
        }
    }

    public void addCount(Count count) {
        if (count!=null){
            ResourseManager.getInstance.minusCount(count.getCount());
        }
    }

    public Count getCount() {
        Count count = new Count();
        count.setCount(ResourseManager.getInstance().getCount());
        return count;
    }
}
