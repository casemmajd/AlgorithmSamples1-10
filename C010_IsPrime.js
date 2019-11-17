
function isPrime(N) {
    let divisor;  
    if (N <= 1)
      return false;  
    let maxToTry;  
    maxToTry = Math.sqrt(N);
   
    for (divisor = 2; divisor <= maxToTry; divisor++) {
      if ( N % divisor == 0 ) 
        return false; 
    }
    return true; 
  }

console.log(isPrime(17));
