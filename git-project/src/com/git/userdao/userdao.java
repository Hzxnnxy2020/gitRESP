package com.git.userdao;



import java.util.List;

public class userdao {
  
	private int id;
	private char name;
	
	
	public int getId() {
		return id+20;
	}
	public void setId(int id) {
		this.id = id;
	}
	public char getName() {
		return name;
	}
	public void setName(char name) {
		this.name = name;
	}
	
	
	public  void addUser(int id,String username,String password) {
		//��Ӳ���
	}
	public void deleteUser(int id) {
		//ɾ������
	}
	public void updateUser(int id,String newUsername,String newpassword) {
		//�޸Ĳ���
	}
	public List<Object> getUsers(int pageIndex,int pageSize){
		
		return null;
	}
	
	}

