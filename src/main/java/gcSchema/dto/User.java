package gcSchema.dto;

import org.springframework.beans.factory.BeanNameAware;

import gcSchema.myAWare.MyAware;

public class User implements MyAware,BeanNameAware{
	private String name;
	private String sex;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setUserWify(String name) {
		System.out.println("调用了。。。。。。。。。。。。。。。。。。。。");
	}
	public void setBeanName(String name) {
		System.out.println("======================="+name);
	}
}
