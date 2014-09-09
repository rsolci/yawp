package endpoint.repository;

import static org.junit.Assert.assertEquals;
import endpoint.repository.annotations.Endpoint;
import endpoint.repository.annotations.Id;

@Endpoint(path = "/anothersimpleobjects", index = false)
public class AnotherSimpleObject {

	@Id
	private Long id;

	private String aString;

	public AnotherSimpleObject() {

	}

	public Long getId() {
		return id;
	}

	public AnotherSimpleObject(String aString) {
		super();
		this.aString = aString;
	}

	public String getaString() {
		return aString;
	}

	public void setaString(String aString) {
		this.aString = aString;
	}

	public void assertAnotherObject(String aString) {
		assertEquals(aString, getaString());
	}

}