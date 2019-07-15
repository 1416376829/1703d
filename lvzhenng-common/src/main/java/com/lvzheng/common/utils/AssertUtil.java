package com.lvzheng.common.utils;

import java.util.Collection;
import java.util.Map;

public class AssertUtil {
 //1.����Ϊ��
 public static void isTrue(Boolean condition,String message){
	 if(Boolean.FALSE.equals(condition)){
		 throw new WeekRuntimeException(message);
	 }
 }
 //2.����Ϊ��
 public static void isFalse(Boolean condition,String message){
	 if(Boolean.TRUE.equals(condition)){
		 throw new WeekRuntimeException(message);
	 }
 }
 //3.���Զ���Ϊ��
 public static void notNull(String exp,String message){
	 if(exp==null||exp.length()==0){
		 throw new WeekRuntimeException(message);
	 }
 }
 //4.���Զ������Ϊ��
 public static void isNull(String exp,String message){
	 if(exp.length()>0){
		 throw new WeekRuntimeException(message);
	 }
 }
 //5.���Լ��ϲ�Ϊ��
 public static void notEmpty(Collection<?> col,String message){
	 if(col==null||col.size()==0){
		 throw new WeekRuntimeException(message);
	 }
 }
 //6.����map���ϲ�Ϊ��
 public static void notEmpty2(Map<?, ?> map,String message){
	 if(map==null||map.size()==0){
		 throw new WeekRuntimeException(message);
	 }
 }
 //7.�����ַ���������ֵ
 public static void hasText(String src,String message){
	 if(!(src.trim().length()>0)){
		 throw new WeekRuntimeException(message);
	 }
 }
 //8.����ֵ�������0
 public static void greaterThanZero(int exp,String message){
	 if(exp<=0){
		 throw new WeekRuntimeException(message);
	 }
 }
}
