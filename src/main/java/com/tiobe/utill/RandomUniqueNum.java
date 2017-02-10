//package com.tiobe.utill;
//
//import java.util.Arrays;
//import java.util.Random;
//
//import org.apache.log4j.Logger;
//import com.tiobe.redis.RedisUtil;
//import redis.clients.jedis.Jedis;
//
///**
//* Title: RandomUniqueNum
//* Description: 
//* Team: SSflow
//* @author Ss
//* @date 2017年1月17日
//*
//*/
//public class RandomUniqueNum extends Random{
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 5065158751417175769L;
//	private Logger logger =Logger.getLogger(RandomUniqueNum.class);
//	Jedis jedis = RedisUtil.getJedis();
//	
//	/**
//	 * 生成不重复的数字
//	 * @param bound 生成的范围
//	 */
//	
//	String[] str ;
//	int i=1;
//	public int uniqueNum(int bound){
//		
//		int random = nextInt(bound);
//		
//		String strs = jedis.get("arr");
//		System.out.println(strs);
//		strs=strs.substring(1, strs.length()-1);
//		str = strs.split(",");
//		System.out.println("------trim()----------");
//		System.out.println(strs.trim());
//		int[] arr = new int[str.length+1];
////		if(str.length==0&&str.equals("")){
////			if(Integer.valueOf(str[0])==random){
////				
////			}
////		}
//		for(int j=0;j<arr.length;j++){
//			if(random==arr[j]){
//				logger.info("数字已重复，重新获取随机数字！");
//				jedis.set("arr", Arrays.toString(arr));
//				break;
//			}
//		}
//		
//		if(strs.length()>0){
//
//			i=str.length;
//			System.out.println("start turning string to int");
//			for(int k=0;k<i;k++){
//				System.out.println("String --> Int ");
//				System.out.println(k+":"+str[k]);
//				System.out.println("------");
//				System.out.println("str:"+str[k]);
//				
//				arr[k] = Integer.valueOf(str[k].trim()).intValue();
//				System.out.println("string -> int ");
//				System.out.println(arr[k]);
//
//			}
//		}
//		System.out.println("redis data : "+strs.trim());
//		if(!(random < 0)&&i>0&&i<str.length+1){
//			System.out.println(" 随机数字 random :"+random);
//			arr[i]=random;
//		}
//		//String.copyValueOf(charArray)
//
//		jedis.set("arr", Arrays.toString(arr));
//		//0-bound
//		return random;
//	}
//	public int uniqueNum(int lowbound,int highbound){
//		//lowbound-highbound
//		
//		return 0;
//	}
//}
