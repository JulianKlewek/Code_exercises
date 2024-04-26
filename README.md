# Package Rice Bags

Provided that you have a given number of small rice bags (1 kilo each) and big rice bags (5 kilos each), write a method that returns true if it is possible to make a package with goal kilos of rice.

Therefore, the sum of the kilos of bigCount and smallCount must be at least equal to the value of goal. The method should return true if it is possible to make a package with goal kilos of flour.

If the sum is greater than goal, ensure that only full bags are used towards the goal amount. For example, if goal = 9, bigCount = 2, and smallCount = 0, the method should return false since each big bag is 5 kilos and cannot be divided. However, if goal = 9, bigCount = 1, and smallCount = 5, the method should return true because of 1 full bigCount bag and 4 full smallCount bags equal goal, and it's okay if there are additional bags left over.
```java
public Boolean packageRice(Integer bigCount, Integer smallCount, Integer goal) {
    
}
```