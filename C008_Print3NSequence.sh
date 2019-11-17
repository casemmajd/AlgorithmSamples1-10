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
    nextN N;  # returning number is different than returning string
    N=$?;  # returns the exit value of the last executed command
    count=$(( count + 1 ));
    echo $N;
    done

  echo;
  echo "There were" $count "terms in the sequence.";
}

function nextN() {
  currentN=$1;
  if (( (currentN % 2) == 1 ))
  then 
    return $(( 3*currentN+1 )); 
  else 
    return $(( currentN/2 )); 
  fi
}

print3NSequence 17;

