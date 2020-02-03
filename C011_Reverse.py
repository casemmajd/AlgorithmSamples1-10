#!/usr/bin/env python36


def reverse(str):
  copy = ""   
  for i in range(len(str)-1, -1, -1):
    copy = copy + str[i]
  return copy;



print(reverse("Hello World!"))
word = "radar"
if (word == reverse(word)):
  print("The word", word, "is a  palindrome!")


