package tiposGenericosEjercicio1;

public class Pair<T, V> {
	private T first;
	private V second;

	
	protected Pair(T first, V second) {
		super();
		this.first = first;
		this.second = second;
	}

	public T getFirst() {
		return first;
	}

	public V getSecond() {
		return second;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public void setSecond(V second) {
		this.second = second;
	}
	
	public static void main(String[] args) {
		Pair<Integer, Float> par1 = new Pair<>(55,(float) 55.5);

		System.out.println(par1.first + "\n" + par1.second);
		
		Pair<String, int[]> par2 = new Pair<>("String", new int[5]);
		par2.setFirst("String");
		par2.setSecond(new int[5]);
		

	}
}
