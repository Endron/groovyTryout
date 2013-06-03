package primeNumbers

class PrimeNumberDivider {

    private final knowenPrime = [2];

    List<Long> divide(long number) {
	def result = new LinkedList<Long>()

	if (number == 0) {
	    return []
	}

	if (number < 0) {
	    number = divideAndAddToResult(number, -1, result)
	}

	while (number > 1) {
	    for (long primenumber : knowenPrime) {
		number = divideAndAddToResult(number, primenumber, result)
	    }

	    this.nextPrimeNumber();
	}

	return result;
    }

    private long divideAndAddToResult(long number, long primenumber, LinkedList result) {
	if (number % primenumber == 0) {
	    number = number / primenumber
	    result.add(primenumber)
	}
	return number
    }

    private long nextPrimeNumber() {
	def maxPrime = 0
	for(long prime : knowenPrime) {
	    if(prime > maxPrime) {
		maxPrime = prime
	    }
	}

	def newPrime = maxPrime
	FIND_NEW_PRIME: while(true) {
	    newPrime++

	    for(def long prime : knowenPrime) {
		if(newPrime % prime == 0) {
		    continue FIND_NEW_PRIME
		}
	    }

	    knowenPrime.add(newPrime)
	    return newPrime
	}
    }
}
