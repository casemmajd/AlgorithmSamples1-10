#!/usr/bin/env phython36

def print3NSequence(N):
  count = 1
  print("The 3N+1 sequence starting from ", N)
  print()
  print(N)  

  while (N > 1):
    if (N % 2 == 1): 
      N = 3 * N + 1
    else:
      N = N / 2
    count += 1   
    print(N) 
  

  print()
  print("There were ", count, " terms in the sequence.")


print3NSequence(17)

