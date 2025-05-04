


# Remove Duplicates from an Array in Java

## Overview
This Java program removes duplicate elements from an array, ensuring only unique values remain. The program accepts user input for the array size and elements, processes them to eliminate duplicates, and displays the resulting array of unique elements.

## How the Code Works
1. The user is prompted to enter the size of the array.
2. The user enters the elements of the array.
3. The program processes the array using nested loops to identify duplicate elements.
4. A new array is created to store only unique elements.
5. The final array with unique elements is displayed.

## Code Breakdown

### 1. Scanner for User Input
```java
Scanner s = new Scanner(System.in);
System.out.println("Enter the array Size");
int size = s.nextInt();
int arr[] = new int[size];
System.out.println("Enter the Elements");
for(int i=0; i<=arr.length-1; i++) {
    arr[i] = s.nextInt();
}
```
- This segment takes the array size and elements as input from the user.
- The `Scanner` class is used to read input values.
- A `for` loop is used to iterate over the array and store input values.

### 2. Counting Unique Elements
```java
int count = 0;
for(int i=0; i<=arr.length-1; i++) {
    boolean isPresent = false;
    for(int j=i+1; j<=arr.length-1; j++) {
        if(arr[i] == arr[j]) {
            isPresent = true;
            break;
        }
    }
    if(!isPresent)
        count++;
}
```
- `count` variable stores the number of unique elements.
- The outer loop iterates through the array.
- The inner loop checks for duplicate values.
- If a duplicate is found, `isPresent` is set to `true`, and the loop breaks.
- If `isPresent` is `false`, `count` is incremented, meaning the element is unique.

### 3. Storing Unique Elements in a New Array
```java
int index = 0;
int b[] = new int[count];
for(int i=0; i<=arr.length-1; i++) {
    boolean isPresent = false;
    for(int j=i+1; j<=arr.length-1; j++) {
        if(arr[i] == arr[j]) {
            isPresent = true;
            break;
        }
    }
    if(!isPresent)
        b[index++] = arr[i];
}
```
- A new array `b[]` is created to store unique elements.
- The same logic is used to check for duplicates.
- If an element is unique, it is added to `b[]` at `index` position.
- `index` is incremented to move to the next position.

### 4. Printing the Final Array
```java
System.out.println(Arrays.toString(b));
```
- The `Arrays.toString()` method is used to print the final array containing only unique elements.

## Key Concepts Explained

### 1. **For Loop**
- Used for iterating through the array.
- Two nested loops are used: the outer loop selects an element, and the inner loop checks for duplicates.

### 2. **Boolean Variable (`isPresent`)**
- Helps track whether an element has a duplicate.
- If `true`, the element is skipped from the unique array.

### 3. **If Condition**
- Checks if `isPresent` is `false`, meaning the element is unique.
- If unique, it is added to the new array, and `count` is incremented.

### 4. **Count Variable**
- Stores the number of unique elements in the array.
- Helps define the size of the final unique array.

## Example Execution
### Input:
```
Enter the array Size
6
Enter the Elements
1 2 2 3 4 4
```

### Output:
```
[1, 2, 3, 4]
```

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Array_Duplicate_Removal.git
```
