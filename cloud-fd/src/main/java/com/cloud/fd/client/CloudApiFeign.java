package com.cloud.fd.client;

import com.cloud.api.CloudApi;
import feign.hystrix.FallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(
        value = "cloud-base",
        contextId = "cloudApiFeign",
        path = CloudApi.PREFIX,
        //,
        //fallback = CloudApi.DefaultFallback.class
        fallbackFactory = CloudApiFeign.DefaultFallbackFactory.class
        //url = "${cloudApi}"
)
public interface CloudApiFeign extends CloudApi {

    class DefaultFallbackFactory implements FallbackFactory<CloudApi> {

        @Override
        public CloudApi create(Throwable throwable) {
            //记录异常
            throwable.printStackTrace();

            //返回降级对象
            return new CloudApi.DefaultFallback();
        }
    }

}
