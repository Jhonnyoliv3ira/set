package entities;

import java.util.Objects;

public class User {
	
	Integer user;

	public User(Integer user) {
		super();
		this.user = user;
	}

	public Integer getUser() {
		return user;
	}

	public void setUser(Integer user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		return Objects.hash(user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(user, other.user);
	}

	@Override
	public String toString() {
		return "User [user=" + user + "]";
	}
	
	
}
