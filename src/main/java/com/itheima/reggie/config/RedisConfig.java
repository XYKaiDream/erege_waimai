package com.itheima.reggie.config;

import org.springframework.cache.annotation.CachingConfigurationSelector;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @author XYK
 * @version 1.0
 */
@Configuration
public class RedisConfig extends CachingConfigurerSupport {
    @Bean
    public RedisTemplate<Object,Object> redisTemplate(RedisConnectionFactory redisConnectionFactory){
        RedisTemplate<Object, Object> objectObjectRedisTemplate = new RedisTemplate<>();
        objectObjectRedisTemplate.setKeySerializer(new StringRedisSerializer());
        objectObjectRedisTemplate.setHashKeySerializer(new StringRedisSerializer());
        objectObjectRedisTemplate.setConnectionFactory(redisConnectionFactory);
        return objectObjectRedisTemplate;
    }

}
