package com.prog39599.lombok;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.AccessLevel;

@Getter@Setter(AccessLevel.PUBLIC)
@ToString
public class Person2 {
	private String fname;
	private String lname;
	private String address;

	
	
}
