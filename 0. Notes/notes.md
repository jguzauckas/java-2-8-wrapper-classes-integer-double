# Wrapper Classes: `Integer` and `Double`

We've been talking in this unit about how Java is an object-oriented programming language, and many of its strengths come in the form of classes and objects. Due to this preference, we will sometimes want to use basic information like our primitive types `int` and `double`, but in the form of objects to take advantage. Fortunately, we have a way to do this through the use of **wrapper classes**, which define our primitive types as an object for us to be able to work with. We will be working with the wrapper classes `Integer` and `Double` (notice the capitals, like any other class such as `Person` or `Car`!), which are included with the `String` class in the `Java.lang` package, which is available by default in Java, giving us access to them.

---

## `Integer` Class

The **`Integer` class** is designed to work with an `int` value as an object instead of as a primitive value. To make an `Integer` object, we just need to call its constructor, which just like `String`, we can do in two different ways: the traditional way with the `new Integer()` call or simply assigning an `int` value to it. Here is an example from the `NotesInteger1.java` file:

```java
Integer var1 = new Integer(15);
Integer var2 = 15;
```

In this sample, both `var1` and `var2` are assigned an `Integer` object with a value of `15` inside. As of Java Version 9 (09/21/2017), the `Integer()` constructor has been deprecated (no longer used, marked for removal), but the AP course still discusses it, so we still use it here.

Due to being an object, `var1` and `var2` in the example above are not just the number `15`, just like any other object, that kind of information is saved as a variable inside of the class, in this case the variable is called `value`, which is assigned the value of `15` by the constructor. Thus, just like any other object, to access a variable's value we have to use a method, which in this case is the `intValue()` method, like in this example from the `NotesInteger2.java` file:

```java
Integer var1 = new Integer(15);
System.out.println(var1.intValue());
```

Here is the output from this code:

```
15
```

Just like `String` objects, `Integer` objects are immutable and cannot change, so instead of using a method to change the `value` variable, if we need to change the value of an `Integer` object, we just assign it a new `Integer` object with the new object we want. Here is what this can look like from the `NotesInteger3.java` file:

```java
Integer var1 = new Integer(15);
System.out.println(var1.intValue());
var1 = 20;
System.out.println(var1.intValue());
var1 = new Integer(25);
System.out.println(var1.intValue());
```

Notice that after the first line, we no longer have to precede `var1` with `Integer` since the variable is already declared. We can use either method of constructing an `Integer` object to create a new value and assign it to our variable. Here is the output from this code:

```
15
20
25
```

Those are the basic resources needed to create and work with an `Integer` object, though the `Integer` class does come with two constants that we introduced in the last unit when discussing the boundaries of what an `int` can store: `Integer.MAX_VALUE` and `Integer.MIN_VALUE`. Some classes can come with constant values that can be accessed by using the class name instead of an object of the class in order to utilize them, and `MAX_VALUE` and `MIN_VALUE` are two such constants. These two constants can replace anywhere you would want to use an `int` value, including assignment to an `Integer` object. Here are some examples from the `NotesInteger4.java` file:

```java
int var1 = Integer.MAX_VALUE;
Integer var2 = new Integer(Integer.MIN_VALUE);
Integer var3 = Integer.MAX_VALUE;
var1 -= Integer.MIN_VALUE;
System.out.println(Integer.MIN_VALUE * 5);
```

These are just a few ways these constants could be used shown above: variable assignment, compound assignment, arithmetic, etc.

---

## `Double` Class

The **`Double` class** functions similarly to the `Integer` class, but instead works with `double` values. Just like `String` and `Integer`, the constructor can be called two ways, as seen in this example from the `NotesDouble1.java` file:

```java
Double var1 = new Double(15.2);
Double var2 = 15.2;
```

In this sample, both `var1` and `var2` are assigned a `Double` object with a value of `15.2` inside. As of Java Version 9 (09/21/2017), the `Double()` constructor has been deprecated (no longer used, marked for removal), but the AP course still discusses it, so we still use it here.

Due to being an object, `var1` and `var2` in the example above are not just the number `15.2`, just like any other object, that kind of information is saved as a variable inside of the class, in this case the variable is called `value`, which is assigned the value of `15.2` by the constructor. Thus, just like any other object, to access a variable's value we have to use a method, which in this case is the `doubleValue()` method, like in this example from the `NotesDouble2.java` file:

```java
Double var1 = new Double(15.2);
System.out.println(var1.doubleValue());
```

Here is the output from this code:

```
15.2
```

Just like `String` and `Integer` objects, `Double` objects are immutable and cannot change, so instead of using a method to change the `value` variable, if we need to change the value of a `Double` object, we just assign it a new `Double` object with the new object we want. Here is what this can look like from the `NotesDouble3.java` file:

```java
Double var1 = new Double(15.2);
System.out.println(var1.doubleValue());
var1 = 15.3;
System.out.println(var1.doubleValue());
var1 = new Double(15.4);
System.out.println(var1.doubleValue());
```

Notice that after the first line, we no longer have to precede `var1` with `Double` since the variable is already declared. We can use either method of constructing an `Double` object to create a new value and assign it to our variable. Here is the output from this code:

```
15.2
15.3
15.4
```

Those are the basic resources needed to create and work with an `Double` object!

---

## Autoboxing and Unboxing

Java will often do a conversion from a primitive value to a wrapper class automatically when needed. This feature is called **autoboxing**, and will convert an `int` value to an `Integer` object and a `double` value to a `Double` object in specific scenarios:
- When a primitive type is passed as a parameter to a method that expects an object of the corresponding wrapper class.
- When a primitive type is assigned to a variable of the corresponding wrapper class. (We have already seen this one when we construct via something like `Integer var1 = 15;`)

Here is an example of each scenario for autoboxing from the `NotesAutoboxing1.java` file:

```java
public static void autoboxMethod(Integer i){
    System.out.println(i.intValue() + 5);
}

public static void main(String[] args){
    autoboxMethod(15); // Autoboxing on parameter
    Integer var1 = 15; // Autoboxing on variable
}
```

Here I created a sample method called `autoboxMethod()` that expects an `Integer` object parameter, but due to autoboxing we are later able to send it just an `int` value and it turns it into an `Integer` object with the `value` `15` for us. Similarly, the variable assignment automatically turns `15.2` into an `Double` object with the `value` `15.2` to save to the variable. 

Autoboxing goes from primitive type to wrapper class, and the reverse of that goes from wrapper class to primitive type is called **unboxing**. This will convert an `Integer` object to an `int` value and a `Double` object to a `double` value in specific scenarios:
- When a wrapper class object is passed as a parameter to a method that expects a value of the corresponding primitive type.
- When a wrapper class object is assigned to a variable of the corresponding primitive type.

Here is an example of each scenario for unboxing from the `NotesUnboxing1.java` file:

```java
public static void unboxMethod(int i){
    System.out.println(i + 5);
}

public static void main(String[] args){
    Integer var1 = new Integer(15);
    unboxMethod(var1); // Unboxing on parameter
    double var2 = new Double(15.2); // Unboxing on variable
}
```

Here I created a sample method called `unboxMethod()` that expects an `in` value parameter, but due to unboxing we are later able to send it an `Integer` object and it turns it into an `int` value with `int` value `15` for us. Similarly, the variable assignment automatically turns the `Double` object with `value` `15.2` into the `double` value `15.2` to save to the variable.

---

## Assignment

Now that you have gone through the notes for this section, you can check out the `Try.md` and `Try.java` files to try a short assignment using this material.
