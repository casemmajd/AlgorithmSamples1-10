#!/bin/bash -


function reverse() {
  copy=""
  var=${1}
  for (( i=${#var}-1; i>=0; i-- )) do  # `expr length ${1}` 
    copy+=${var:i:1}
  done
  echo $copy
}

echo $(reverse "Hello World!")
word="radar"
if (( $word == $(reverse $word) )); then    # note the nested $var
  echo "The word" $word "is a  palindrome!"
fi