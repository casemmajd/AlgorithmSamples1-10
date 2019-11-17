#!/usr/bin/env python36


def print3NSequence(N):
  if (N <= 0):
    raise Exception( "Starting value must be positive." );

  count = 1
  print("The 3N+1 sequence starting from ", N)
  print()
  print(N)  

  while (N > 1):
    N = nextN(N)
    count += 1   
    print(N) 
  

  print()
  print("There were ", count, " terms in the sequence.")


def nextN(currentN):
  if (currentN % 2 == 1):
    return 3*currentN + 1
  else:
    return currentN / 2


print3NSequence(17)

