package com.kd.springcloud.controller;

import com.kd.springcloud.dto.DtoBean;
import com.kd.springcloud.service.ProviderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/dtoBean")
public class DtoBeanController {

    private static Logger logger = LoggerFactory.getLogger(DtoBeanController.class);

    @Autowired
    private ProviderService providerService;

    @GetMapping("/{id}")
    public DtoBean get(@PathVariable("id") String id) {
        return providerService.getDtoBeanById(id);
    }
}
