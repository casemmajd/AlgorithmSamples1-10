#!/bin/bash -


function isPrime() {
  N=$1
  if ((N <= 1)) 
  then
    echo 'false'
  fi
  maxToTry=$(echo "$N" | awk '{print sqrt($1)}')  # Shell does not have sqrt(), hence use awk
  maxToTry=${maxToTry%.*}  # convert float to integer
 
  for ((divisor=2;  divisor <= $maxToTry; divisor++)) 
    do
    if (( N % divisor == 0 )) 
    then
      echo 'false'  
      return
    fi
    done
  echo 'true'
}

echo $(isPrime 19)

