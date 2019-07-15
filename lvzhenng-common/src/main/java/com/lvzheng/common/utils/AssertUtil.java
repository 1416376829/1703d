package com.lvzheng.common.utils;

import java.util.Collection;
import java.util.Map;

public class AssertUtil {
 //1.断言为真
 public static void isTrue(Boolean condition,String message){
	 if(Boolean.FALSE.equals(condition)){
		 throw new WeekRuntimeException(message);
	 }
 }
 //2.断言为假
 public static void isFalse(Boolean condition,String message){
	 if(Boolean.TRUE.equals(condition)){
		 throw new WeekRuntimeException(message);
	 }
 }
 //3.断言对象不为空
 public static void notNull(String exp,String message){
	 if(exp==null||exp.length()==0){
		 throw new WeekRuntimeException(message);
	 }
 }
 //4.断言对象必须为空
 public static void isNull(String exp,String message){
	 if(exp.length()>0){
		 throw new WeekRuntimeException(message);
	 }
 }
 //5.断言集合不为空
 public static void notEmpty(Collection<?> col,String message){
	 if(col==null||col.size()==0){
		 throw new WeekRuntimeException(message);
	 }
 }
 //6.断言map集合不为空
 public static void notEmpty2(Map<?, ?> map,String message){
	 if(map==null||map.size()==0){
		 throw new WeekRuntimeException(message);
	 }
 }
 //7.断言字符串必须有值
 public static void hasText(String src,String message){
	 if(!(src.trim().length()>0)){
		 throw new WeekRuntimeException(message);
	 }
 }
 //8.断言值必须大于0
 public static void greaterThanZero(int exp,String message){
	 if(exp<=0){
		 throw new WeekRuntimeException(message);
	 }
 }
}
