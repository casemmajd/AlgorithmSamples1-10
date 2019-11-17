#!/bin/bash - 

function print3NSequence() {
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

print3NSequence 17;

