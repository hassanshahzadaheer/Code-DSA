## Push Operation in Array

The `PushOperationInArray` class demonstrates adding elements to an array using the `push` operation. It provides the following functionality:

- `push(Object item)`: Adds an item to the array.
- `get(int index)`: Retrieves the element at the specified index from the array.

### Usage

```java
PushOperationInArray pushData = new PushOperationInArray();
pushData.push("Aheer");
pushData.push(25);


The `PushOperationInArray` class demonstrates adding elements to an array using the `push` operation. It provides the following functionality:

- `push(Object item)`: Adds an item to the array.
- `get(int index)`: Retrieves the element at the specified index from the array.

PushOperationInArray pushData = new PushOperationInArray();
pushData.push("Aheer");
pushData.push(25);
```

The above code creates an instance of `PushOperationInArray`, adds the items "Aheer" and 25 to the array using the `push` method, and then prints the array elements.

### Class Details

#### Instance Variables

- `length`: An integer variable that represents the length of the array.
- `data`: An array of type `Object` to store the elements.

#### Methods

- `PushOperationInArray()`: Constructor that initializes the array with a length of 0.
- `push(Object item)`: Adds an item to the array.
- `get(int index)`: Retrieves the element at the specified index from the array.

### Technical Terminology

- Class: A blueprint for creating objects that defines the attributes and behaviors of an object.
- Instance variables: Variables defined within a class that hold the state or data of an object.
- Constructor: A special method used to initialize the state of an object when it is created.
- Array: A data structure that holds a fixed-size sequence of elements of the same type.
- `length`: An instance variable that keeps track of the length of the array.
- `data`: An instance variable that represents the array to store the elements.
- `Object`: The base class for all types in Java.
- `get`: A method that retrieves the element at a specified index from the array.
- `push`: A method that adds an item to the array.
- `Arrays.copyOf`: A method that creates a new array with a specified length and copies the elements from the original array.
- `main`: The entry point of the Java program.
```
