package com.kd.springcloud.hystric;

import com.kd.springcloud.dto.DtoBean;
import com.kd.springcloud.service.ProviderService;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ProviderServiceFallbackFactory implements FallbackFactory<ProviderService> {

    private Logger logger = LoggerFactory.getLogger(ProviderServiceFallbackFactory.class);

    @Override
    public ProviderService create(Throwable throwable) {

        return id -> {
            logger.warn("fallback exception:",throwable);
            return new DtoBean("ooooooooooo");
        };
    }

}
