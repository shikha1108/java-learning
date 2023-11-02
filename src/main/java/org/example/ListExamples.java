package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {

    public Integer findSecondLargest(List<Integer> nums) {
        int secondLargest = nums.get(0);
        int largest = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > secondLargest) {
                if (nums.get(i) > largest) {
                    secondLargest = largest;
                    largest = nums.get(i);
                } else {
                    secondLargest = nums.get(i);
                }
            }
        }
        return secondLargest;
    }

    public Integer firstElement(List<Integer> nums) {
        return nums.get(0);

    }

    public Integer lastElement(List<Integer> nums) {
        return nums.get(nums.size() - 1);
    }

    public Integer secondLastElement(List<Integer> nums) {
        return nums.get(nums.size() - 2);
    }

    public Integer sumOfAll(List<Integer> nums) {
        Integer sum = 0;
        for (Integer num : nums) {
            sum = sum + num;
        }
        return sum;
    }

    public Integer findMaximum(List<Integer> nums) {
        Integer max = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max;
    }

    public Integer findMinimum(List<Integer> nums) {
        Integer min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return min;
    }

    public List<Integer> removeDuplicate(List<Integer> nums) {
        List<Integer> newList = new ArrayList<>();
        for (Integer num : nums) {
            if (!newList.contains(num)) {
                newList.add(num);
            }
        }
        return newList;
    }

    public Integer getMiddleNumber(List<Integer> nums) {
        Integer listSize = nums.size();
        Integer middleSize = listSize / 2;
        Integer middleNumber = nums.get(middleSize);
        return middleNumber;
    }

    public Integer getMiddleAndPlusTwo(List<Integer> nums) {
        Integer listsize = nums.size();
        Integer middleSize = listsize / 2 + 2;
        Integer middle = nums.get(middleSize);
        return middle;
    }

    public List<Integer> reverse(List<Integer> nums) {
        List<Integer> reverseList = new ArrayList<>();
        for (Integer num : nums) {
            reverseList.add(0, num);
        }
        return reverseList;
    }

    public List<Integer> findEvenNumbers(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                result.add(nums.get(i));
            }
        }
        return result;
    }

    public List<Integer> findOddNumbers(List<Integer> nums) {
        List<Integer> oddNumberList = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                oddNumberList.add(nums.get(i));
            }
        }
        return oddNumberList;
    }

    public Integer findIndex(List<Integer> nums, Integer key) {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == key) {
                return i;
            }
        }
        return -1;
    }

    public Integer secondMaximum(List<Integer> nums) {
        Integer max = nums.get(0);
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
        }
        nums.remove(max);
        Integer max1 = nums.get(0);
        for (Integer n : nums) {
            if (n > max1) {
                max1 = n;
            }
        }
        return max1;
    }

    public String concatenation(List<String> sts) {
        String add = "";
        for (String strs : sts) {
            add = add + strs;
        }
        return add;
    }

    public Boolean search(List<Integer> nums, Integer key) {
        Boolean result = false;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == key) {
                result = true;
            }
        }
        return result;
    }

    public List<Integer> movesAllZeroesToEnd(List<Integer> nums) {
        List<Integer> movesZeroList = new ArrayList<>();
        Integer result = 0;
        for (int i = 0; i < nums.size() ; i++) {
            if(nums.get(i) != 0) {
                result += 1;
                movesZeroList.add(0,result);
            }
            else {
                movesZeroList.add(nums.get(i));
            }
        }
       return movesZeroList;
    }
}

