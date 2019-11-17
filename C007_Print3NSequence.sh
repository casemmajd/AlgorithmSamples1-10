#!/bin/bash - 

function IllegalArgumentException() {
  local resultvar="IllegalArgumentException-Starting-value-must-be-positive";
  echo $resultvar;
}

function throw()
{
  echo $1
  exit 1
}

function print3NSequence() {
  if [ $1 -le 0 ]; then
    throw $(IllegalArgumentException);
  fi

  count=1;
  N=$1;
  echo "The 3N+1 sequence starting from " $N;
  echo;

  echo N;  
  while (( N > 1 ))
    do
      if (( (N % 2) == 1 ));
      then N=$(( 3 * N + 1 ));
      else N=$(( N / 2 ));
      fi
    count=$(( count + 1 ));
    echo $N;
    done

  echo;
  echo "There were" $count "terms in the sequence.";
}

print3NSequence -17;

