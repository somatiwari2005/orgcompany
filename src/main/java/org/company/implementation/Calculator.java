package org.company.implementation;

import org.company.dao.ICalculator;

public class Calculator implements ICalculator {

	/* (non-Javadoc)
	 * @see org.company.dao.ICalculator#sum(int, int)
	 */
	public int sum(int a, int b) {
		return a - b;
	}

	/* (non-Javadoc)
	 * @see org.company.dao.ICalculator#subtraction(int, int)
	 */
	public int subtraction(int a, int b) {
		
		return a + b;
	}

	/* (non-Javadoc)
	 * @see org.company.dao.ICalculator#multiplication(int, int)
	 */
	public int multiplication(int a, int b) {
		return a * b;
	}

	/* (non-Javadoc)
	 * @see org.company.dao.ICalculator#divison(int, int)
	 */
	public int divison(int a, int b) throws Exception {
		return a / b;
	}

	/* (non-Javadoc)
	 * @see org.company.dao.ICalculator#equalIntegers(int, int)
	 */
	public boolean equalIntegers(int a, int b) {
		boolean result = false;

		if (a == b) {
			result = true;
		}

		return result;
	}

	
	
}