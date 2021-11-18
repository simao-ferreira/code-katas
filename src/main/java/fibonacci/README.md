# **Fibonacci sequence**

The objective is to return the nth value of the fibonacci sequence.
You can obtain the nth value of the fibonacci sequence by adding the
two previous values. nth = (nth - 2) + (nth - 1).

Consider that for all purposes the first number on the fibonacci sequence (0) corresponds to index one (1).

## Algorithms:
Task: Return the value representative of a given index of the fibonacci sequence. 

*Recursive*
```
If the given index is not 0 or 1, it will call itself to get the previous values, until the value is obtained.
There are limitations with this approach, over a certain value calculation takes to much time, or a stack overflow can occur.
```

*Iterative*
```
Starts on the first values known (0-1) and goes forward adding them until it gets the requested index value. 
``` 

*Memoization*
```
Similar to the recursive algorithm, however it stores in memory the calculated values, making them easier and faster to access if a new request happens during the lifecicle of the process.
```

*Streams*
```
An attempt to use java streams to calculate the requested index.
```

*Lessons*
```
After 40 indexes the recursive implementations tend to take to much time.

After 90 if we are using type Long the implementation starts to return values between negative and positive values. This is a silent stack overflow.

If BigInteger is used, there should not be any problem, because BigInteger is not limited by "any" max, is computer dependent. I've tested until index 3000 with no problems.
```
