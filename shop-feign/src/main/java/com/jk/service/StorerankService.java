package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "shop-manager-provider")
public interface StorerankService extends StorerankApi{
}
