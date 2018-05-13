package com.kd.springcloud.controller;

import com.kd.springcloud.dto.DtoBean;
import com.kd.springcloud.facade.ProviderFacade;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProviderFacadeImpl implements ProviderFacade {


    @Override
    public DtoBean getDtoBeanById(String id) {
        return  new DtoBean("123");
    }
}
