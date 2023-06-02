package com.example.demo.redisConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.example.demo.config.Country;

@Configuration
public class RedisConfig {

	@Bean
	public JedisConnectionFactory jedisConne() {

		JedisConnectionFactory jedis = new JedisConnectionFactory();

		// jedis server properties
		return jedis;
	}

	@Bean
	public RedisTemplate<String, Country> redisTemplate() {

		RedisTemplate<String, Country> rt = new RedisTemplate<>();

		rt.setConnectionFactory(jedisConne());

		return rt;
	}
}
