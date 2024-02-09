package setsConjuntos;

import java.util.HashSet;

public class Explicacion {
	class Money {

		private int amount;
		private String currencyCode;

		public Money(int dinero, String code) {
			this.amount = dinero;
			this.currencyCode = code;
		}

		public int getAmount() {
			return amount;
		}

		public String getCurrencyCode() {
			return currencyCode;
		}

		@Override
		public boolean equals(Object o) {

			if (o == this)
				return true;
			if (!(o instanceof Money))
				return false;
			Money other = (Money) o;
			boolean currencyCodeEquals = (this.currencyCode == null && other.currencyCode == null)
					|| (this.currencyCode != null && this.currencyCode.equals(other.currencyCode));
			return this.amount == other.amount && currencyCodeEquals;
		}

		@Override
		public int hashCode() {
			// Todos los strings tienen este método
			if (currencyCode != null)
				return currencyCode.hashCode() + amount;
			return amount + 3;
		}

	}
	
	public static void main(String[] args) {
		HashSet<Integer> numbersValues = new HashSet<Integer>();
		  
	    numbersValues.add(4);
	    numbersValues.add(6);
	    numbersValues.add(8);
	    numbersValues.add(10);
	    numbersValues.add(12);

	    System.out.println("Initial hashSet " + numbersValues);

	    HashSet<Integer> numbersValuesToRetain = new HashSet<Integer>();
	    arrset2.add(4);
	    arrset2.add(6);
	    arrset2.add(8);

	    System.out.println("Values to retain" + numbersValuesToRetain);
	    numbersValues.retainAll(numbersValuesToRetain);

	    System.out.println("HashSet after retainAll " + numbersValues);
	}


    System.out.println("Values to retain" + numbersValuesToRetain);
    numbersValues.retainAll(numbersValuesToRetain);

    System.out.println("HashSet after retainAll " + numbersValues);
}
