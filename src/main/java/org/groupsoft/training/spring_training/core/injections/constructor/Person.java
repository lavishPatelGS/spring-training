package org.groupsoft.training.spring_training.core.injections.constructor;

public class Person {
	private String personId;
	private String name;
	private Role role;

	public Person(String personId, String name, Role role) {
		super();
		this.personId = personId;
		this.name = name;
		this.role = role;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", role=" + role + "]";
	}
}
