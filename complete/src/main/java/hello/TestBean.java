package hello;
public class TestBean {
	private String name;
	public TestBean(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return name;
	}
}