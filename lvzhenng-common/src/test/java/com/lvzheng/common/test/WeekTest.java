package com.lvzheng.common.test;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

import com.lvzheng.common.utils.AssertUtil;
import com.lvzheng.common.utils.WeekRuntimeException;

public class WeekTest {
@Test
//1.断言为真
public void fun1test(){
	try {
		AssertUtil.isTrue(false, "这不是true");
	} catch (WeekRuntimeException e) {
		e.printStackTrace();
	}
}
@Test
//2.断言为假
public void fun2test(){
	try {
		AssertUtil.isFalse(false, "这不是假");
	} catch (WeekRuntimeException e) {
		e.printStackTrace();
	}
}
@Test
//3.断言对象不为空
public void fun3test(){
	try {
		AssertUtil.notNull("as","这个对象为空");
	} catch (WeekRuntimeException e) {
		e.printStackTrace();
	}
}
@Test
//4.断言对象必须为空
public void fun4test(){
	try {
		AssertUtil.isNull("","这个对象不为空");
	} catch (WeekRuntimeException e) {
		e.printStackTrace();
	}
}
@Test
//5.断言集合不为空
public void fun5test(){
	try {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(12);
		AssertUtil.notEmpty(arrayList,"这个集合为空");
	} catch (WeekRuntimeException e) {
		e.printStackTrace();
	}
}
@Test
//6.断言map集合不为空
public void fun6test(){
	try {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(12, "jk");
		AssertUtil.notEmpty2(hashMap,"这个map集合为空");
	} catch (WeekRuntimeException e) {
		e.printStackTrace();
	}
}
@Test
//7.断言字符串必须有值
public void fun7test(){
	try {
		AssertUtil.hasText("","这个字符串没有值");
	} catch (WeekRuntimeException e) {
		e.printStackTrace();
	}
}
@Test
//8.断言值必须大于0
public void fun8test(){
	try {
		AssertUtil.greaterThanZero(-2,"这个值小于0");
	} catch (WeekRuntimeException e) {
		e.printStackTrace();
	}
}
}
