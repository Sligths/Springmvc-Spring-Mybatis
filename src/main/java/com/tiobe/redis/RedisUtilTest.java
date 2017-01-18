package com.tiobe.redis;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Random;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.SUCCESSFUL;
import org.springframework.context.annotation.Configuration;

import com.tiobe.utill.RandomUniqueNum;

import redis.clients.jedis.Jedis;

/**
* Title: RedisUtilTest
* Description: 
* Team: SSflow
* @author Ss
* @date 2017年1月17日
*
*/
@Configuration("classpath:redis.properties")
public class RedisUtilTest {
	private Logger logger =Logger.getLogger(RedisUtilTest.class);
	Jedis jedis = RedisUtil.getJedis();

	public void testGetJedis() {
		
		jedis.set("1", "my turn");
		jedis.append("1", " is coming ");
		System.out.println(jedis.get("1"));
	}

	@Test
	public void testReturnResource() {
//		jedis.del("arr");
//		int[] arr= new int[]{0};
//		jedis.set("arr", Arrays.toString(arr));
		
		RandomUniqueNum random = new RandomUniqueNum();
		int num = random.uniqueNum(9);
		logger.info("this is the random num : "+num);
		
		logger.info("************");
		logger.info(jedis.get("arr"));
	}

}
