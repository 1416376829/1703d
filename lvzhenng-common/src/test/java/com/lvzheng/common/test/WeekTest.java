package com.lvzheng.common.test;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

import com.lvzheng.common.utils.AssertUtil;
import com.lvzheng.common.utils.WeekRuntimeException;

public class WeekTest {
@Test
//1.����Ϊ��
public void fun1test(){
	try {
		AssertUtil.isTrue(false, "�ⲻ��true");
	} catch (WeekRuntimeException e) {
		e.printStackTrace();
	}
}
@Test
//2.����Ϊ��
public void fun2test(){
	try {
		AssertUtil.isFalse(false, "�ⲻ�Ǽ�");
	} catch (WeekRuntimeException e) {
		e.printStackTrace();
	}
}
@Test
//3.���Զ���Ϊ��
public void fun3test(){
	try {
		AssertUtil.notNull("as","�������Ϊ��");
	} catch (WeekRuntimeException e) {
		e.printStackTrace();
	}
}
@Test
//4.���Զ������Ϊ��
public void fun4test(){
	try {
		AssertUtil.isNull("","�������Ϊ��");
	} catch (WeekRuntimeException e) {
		e.printStackTrace();
	}
}
@Test
//5.���Լ��ϲ�Ϊ��
public void fun5test(){
	try {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(12);
		AssertUtil.notEmpty(arrayList,"�������Ϊ��");
	} catch (WeekRuntimeException e) {
		e.printStackTrace();
	}
}
@Test
//6.����map���ϲ�Ϊ��
public void fun6test(){
	try {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(12, "jk");
		AssertUtil.notEmpty2(hashMap,"���map����Ϊ��");
	} catch (WeekRuntimeException e) {
		e.printStackTrace();
	}
}
@Test
//7.�����ַ���������ֵ
public void fun7test(){
	try {
		AssertUtil.hasText("","����ַ���û��ֵ");
	} catch (WeekRuntimeException e) {
		e.printStackTrace();
	}
}
@Test
//8.����ֵ�������0
public void fun8test(){
	try {
		AssertUtil.greaterThanZero(-2,"���ֵС��0");
	} catch (WeekRuntimeException e) {
		e.printStackTrace();
	}
}
}
