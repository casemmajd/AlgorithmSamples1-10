#!/usr/bin/env python36

import sys

def nextN(currentN) :
  if (currentN % 2 == 1):
    return 3 * currentN + 1
  else :
    return currentN / 2
   


def print3NSequence(startingValue) :
  N = startingValue
  count = 1    

  print("The 3N+1 sequence starting from " + str(N))
  print()
  print("{0:>8.0f} ".format(N), end='')  
  onLine = 1

  while (N > 1) :
    N = nextN(N)
    count += 1
    if (onLine == 5) :
      print()
      onLine = 0

    print("{0:>8.0f} ".format(N), end='')  
    onLine += 1
   
  print()
  print()
  print("There were " + str(count) + " terms in the sequence.")

  

print("This program will print out 3N+1 sequences")
print("for starting values that you specify.")
print();

print("Enter a starting value;")
K = int(input("To end the program, enter 0: "))
while (K > 0):
  print3NSequence(K)
  print("Enter a starting value;")
  K = int(input("To end the program, enter 0: "))
