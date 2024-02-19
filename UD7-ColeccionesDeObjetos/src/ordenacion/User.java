package ordenacion;

import java.time.LocalDateTime;

public class User implements Comparable<User> {
	private int id; // id del usuario
	private String loginName; // login de inicio de sesión
	private LocalDateTime lastLogin; // último inicio de sesión

	User(int id, String loginName) {
		this.id = id;
		this.loginName = loginName;
	}

	public LocalDateTime getlLastLogin() {
		return this.lastLogin;
	}

	public void regSystemLogin() {
		this.lastLogin = LocalDateTime.now();
	}

	@Override
	public String toString() {
		return "{" + this.id + ": " + this.loginName + ": " + this.lastLogin + "}";
	}

	@Override
	public int compareTo(User other) {
		// Comparamos los id de ambos usuarios. Podemos aprovechamos del propio método
		// compareTo()
		// de la clase Integer pues la clase Integer implementa el interfaz Comparable
		return Integer.valueOf(this.id).compareTo(other.id);
	}

//	@Override
//	public boolean equals(Object other) {
//		return this.id == other.id;
//	}

	@Override
    public int hashCode() {
        int result = Integer.hashCode(this.id);
        result = 31*result + this.loginName.hashCode();
        result = 31*result + ((this.lastLogin==null)? 0: this.lastLogin.hashCode());
        return result;
    }
}