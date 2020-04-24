package c_info;

public class InfoVO { //Value Object
	
	String name;
	String Id;
	String tel;
	String sex;
	int age;
	String home;
	
	InfoVO(){}
	
	public InfoVO(String name, String Id, String tel, String sex, int age, String home) {
		//생성자 함수로 받는 애들을 멤버변수에 지정
		this.name = name;
		this.Id = Id;
		this.tel = tel;
		this.sex = sex;
		this.age = age;
		this.home = home;
	}
	
	public String toString() {
		return name + "\t" + Id + "\t" + tel + "\t"
				+ sex + "\t" + age + "\t" + home + "\n";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
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
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	
	
}
