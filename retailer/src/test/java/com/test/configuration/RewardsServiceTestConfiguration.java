package com.test.configuration;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.retailer.rest.service.RetailServiceImpl;

@Profile("test")
@Configuration
public class RewardsServiceTestConfiguration {
   @Bean
   @Primary
   public RetailServiceImpl challengeService() {
      return Mockito.mock(RetailServiceImpl.class);
   }
}