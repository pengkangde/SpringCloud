package com.kd.springcloud.facade;

import com.kd.springcloud.dto.DtoBean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/provider")
public interface ProviderFacade {

     @RequestMapping("/{id}")
     DtoBean getDtoBeanById(@PathVariable("id") String id);
     
}
