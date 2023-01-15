package springmvcform.controller.model;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class Student {
private String name;
private Long id;
@DateTimeFormat(pattern = "dd/MM/yyyy") // date time kaisa lena ha uske leye...
private Date date;
private List<String> Courses;
private String gender;
private String type;
private Address address;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public List<String> getCourses() {
	return Courses;
}
public void setCourses(List<String> courses) {
	Courses = courses;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "Student [name=" + name + ", id=" + id + ", date=" + date + ", Courses=" + Courses + ", gender=" + gender
			+ ", type=" + type + ", address=" + address + "]";
}

}




