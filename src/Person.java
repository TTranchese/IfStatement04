public class Person {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public Person(){
		this.age= (int) Math.floor(Math.random()*(80-5)+5);
	}

	public String getLifeStage(){
		if (age<=12){
			return "Child";
		} else if (age <= 19) {
			return "Teen";
		} else if (age <= 59) {
			return "Adult";
		} else return "Senior Adult";
	}

}
