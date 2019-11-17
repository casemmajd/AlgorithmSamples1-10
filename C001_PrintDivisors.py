#!/usr/bin/env python36



def printDivisors(N): 
  print("The divisors of ", N, " are:")
  for D in range(N+1):
    if N % (D+1) == 0:
        print(D)

printDivisors(22)
