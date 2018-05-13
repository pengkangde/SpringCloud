package com.kd.springcloud.service;

import com.kd.springcloud.facade.ProviderFacade;
import com.kd.springcloud.hystric.ProviderServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;

/*
@FeignClient(name = "eureka-provider",fallbackFactory = ProviderServiceFallbackFactory.class)
public interface ProviderService extends ProviderFacade{

}
*/

@FeignClient(name = "eureka-provider",fallbackFactory= ProviderServiceFallbackFactory.class)
public interface ProviderService extends ProviderFacade{

}

