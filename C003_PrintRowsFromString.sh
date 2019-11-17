#!/bin/bash -


printRow() {
  for (( i=0; i<=$2; i++)) do
    printf $1
  done
}

printRowsFromString() {
  var=${1};
  for (( j=0; j<(`expr length ${1}`); j++ )) do   # Note, the index cannot be "i"
    printRow ${var:j:1} 25;
  done

}

printRowsFromString Casem;
