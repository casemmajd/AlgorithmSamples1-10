#!/bin/bash -


printRow() {
  for (( i=0; i<=$2; i++)) do
    printf $1
  done
}

printRow A 10;
