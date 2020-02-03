#!/bin/bash -


function nextN() {
  currentN=$1
  if (( ($currentN % 2) == 1 )); then
    return $(( 3 * $currentN + 1 ))
  else 
    return $(( $currentN / 2 ))
  fi
}


function print3NSequence() {
  N=$1
  count=1    

  echo "The 3N+1 sequence starting from " $N
  echo ""
  printf "%-8s" $N  
  onLine=1

  while (( N>1 ))
    do
      nextN N
      N=$?
      count=$(( count + 1 ))
      if (( $onLine == 5 )); then
        echo ""
        onLine=0
      fi

      printf "%-8s" $N  
      onLine=$(( onLine + 1 ))
    done
   
  echo ""
  echo ""
  echo "There were " $count " terms in the sequence."
}



echo "This program will print out 3N+1 sequences"
echo "for starting values that you specify."
echo ""

echo "Enter a starting value;"
printf "To end the program, enter 0: "
read K
while (( $K > 0 ))
  do 
    print3NSequence $K
    echo "Enter a starting value;"
    printf "To end the program, enter 0: "
    read K
  done