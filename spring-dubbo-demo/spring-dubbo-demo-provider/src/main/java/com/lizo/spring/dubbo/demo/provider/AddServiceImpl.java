package com.lizo.spring.dubbo.demo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.lizo.spring.dubbo.demo.DemoApi;

/**
 * Created by lizhou on 2017/2/28/028.
 */
@Service
public class AddServiceImpl implements DemoApi {

    public int add(int a, int b) {
        return a + b;
    }

}
