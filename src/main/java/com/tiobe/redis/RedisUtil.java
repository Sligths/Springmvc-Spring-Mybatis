//package com.tiobe.redis;
//
//import org.springframework.beans.factory.annotation.Value;
//
//import redis.clients.jedis.Jedis;
//import redis.clients.jedis.JedisPool;
//import redis.clients.jedis.JedisPoolConfig;
//
///**
//* Title: RedisUtil
//* Description: 
//* Team: SSflow
//* @author Ss
//* @date 2017年1月17日
//* redis连接池工具
//*/
//public class RedisUtil {
//	private static  String redis = "118.184.37.185";
//	private static  int port = 6379 ;
//    private static  int MAX_IDLE = 200;
//    private static  int MIN_IDLE = 20;
//    private static  int TIMEOUT = 10000;
//    private static  boolean TEST_ON_BORROW = true;
//    
//  private static JedisPool jedisPool = null;
//    
//    /**
//     * 初始化Redis连接池
//     */
//    static {
//        try {
//            JedisPoolConfig config = new JedisPoolConfig();
//            config.setMaxIdle(MAX_IDLE);
//            config.setTestOnBorrow(TEST_ON_BORROW);
//            config.setMinIdle(MIN_IDLE);
//            jedisPool = new JedisPool(config, redis, port, TIMEOUT);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//    
//    /**
//     * 获取Jedis实例
//     * @return
//     */
//    public synchronized static Jedis getJedis() {
//        try {
//            if (jedisPool != null) {
//                Jedis resource = jedisPool.getResource();
//                return resource;
//            } else {
//                return null;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//    
//    /**
//     * 释放jedis资源
//     * @param jedis
//     */
//    public static void returnResource(final Jedis jedis) {
//        if (jedis != null) {
//            jedisPool.returnResource(jedis);
//        }
//    }
//    
//    /**
//     * 关闭jedis资源
//     * @param jedis
//     */
//    public static void closeResource(final Jedis jedis) {
//        if (jedis != null) {
//            jedisPool.close();
//        }
//    }
//    
//}
