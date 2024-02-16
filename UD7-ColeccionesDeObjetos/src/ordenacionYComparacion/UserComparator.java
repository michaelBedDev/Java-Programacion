package ordenacionYComparacion;

import java.util.Comparator;

class UserComparator implements Comparator<User> {
	@Override
	public int compare(User u1, User u2) {
		// Podemos aprovechamos del propio método compareTo() de la clase LocalDateTime
		// ya que implementa el interfaz Comparable
		return u1.getlLastLogin().compareTo(u2.getlLastLogin());
	}
}
