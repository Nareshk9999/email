package com.demo.email.dto;

public class RequestEmailDto {

	
	private String to;
	private String from;
	private String sub;
	private String body;
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	@Override
	public String toString() {
		return "RequestEmailDto [to=" + to + ", from=" + from + ", sub=" + sub + ", body=" + body + "]";
	}
	
	
	


}
