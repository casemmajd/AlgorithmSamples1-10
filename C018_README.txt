This exercise builds on Exercise C017_ComputeNumberOfRolls. 
Every time you roll the dice repeatedly, trying to get a given total, the number of rolls it takes can be different. 
The question naturally arises, what's the average number of rolls to get a given total? 

Write a function that performs the experiment of rolling to get a given total 10000 times. 
The desired total is a parameter to the subroutine. 
The average number of rolls is the return value. 

Each individual experiment should be done by calling the function you wrote for Exercise C017_ComputeNumberOfRolls. 
Now, write a main program that will call your function once for each of the possible totals (2, 3, ..., 12). 
It should make a table of the results, something like:



Total In Dice      Average Number of Rolls
-------------      -----------------------
      2                    35.9028
      3                    17.8962
      4                    12.1415
      5                     9.0784
      6                     7.1309
      7                     5.9933
      8                     7.2547
      9                     9.0581
     10                    12.0088
     11                    17.9763
     12                    35.8486