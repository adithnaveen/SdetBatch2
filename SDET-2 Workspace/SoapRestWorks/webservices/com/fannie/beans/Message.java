package com.fannie.beans;

public class Message {
	
	private int messageId;
	private String msg;
	private String author;
	
	public Message(){}
	public Message(int messageId, String msg, String author){
		this.msg = msg;
		this.messageId = messageId;
		this.author = author;
	}
	
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
}
