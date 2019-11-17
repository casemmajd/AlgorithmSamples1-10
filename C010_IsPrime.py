#!/usr/bin/env python36

import math

def isPrime(N):
    if (N <= 1):
      return 'false'
    maxToTry = int(math.sqrt(N))
   
    for divisor in range(maxToTry):
      if ( N % (divisor+2) == 0 ):
        return 'false'
    return 'true'

print(isPrime(5))
