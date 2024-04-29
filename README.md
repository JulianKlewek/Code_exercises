# Package Rice Bags (part 2)

Provided that you have a given number of small rice bags (1 kilo each) and big rice bags (5 kilos each), write a method that returns the minimum number of small bags necessary to package goal kilos of rice. Return -1 if it is not possible to package the required rice amount with the bags provided.
If the sum is greater than goal, ensure that only full bags are used towards the goal amount. For example, if goal = 9, bigCount = 2, and smallCount = 0, the method should return false since each big bag is 5 kilos and cannot be divided. However, if goal = 9, bigCount = 1, and smallCount = 5, the method should return true because of 1 full bigCount bag and 4 full smallCount bags equal goal, and it's okay if there are additional bags left over.
```java
public int getNumberSmallBags(Integer bigCount, Integer smallCount, Integer goal) {
    
}
```