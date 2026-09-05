# Java OOP Shapes Project

A Java OOP project that demonstrates the main Object-Oriented Programming concepts through a simple Shapes application.

## 📌 About The Project

This project reads different shapes from an input file, creates the corresponding objects, calculates their areas, saves the total area in an output file, and displays the shapes using a simple Java Swing GUI.

## 🛠️ Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Java Swing
* File Handling
* `Scanner`
* `PrintWriter`

## 🧠 OOP Concepts Used

### 1. Abstraction

Used abstract classes such as:

* `Shape`
* `ThreeDShape`

The classes define common behavior that can be implemented by their subclasses.

### 2. Inheritance

`Circle` extends `Shape`.

`ThreeDShape` also extends `Shape`.

This allows subclasses to reuse the common properties and methods of `Shape`.

### 3. Interface

Created a `Drawable` interface that defines:

```java
String howToDraw();
double getArea();
```

The `Shape` class implements this interface.

### 4. Polymorphism

Used:

```java
Drawable[] ar = new Drawable[n];
```

The same array can store different shape objects such as `Circle` and `Cube`.

The program then calls:

```java
ar[i].getArea();
```

without needing to know the exact type of the object.

### 5. Encapsulation

The `Circle` class uses a private field:

```java
private double radius;
```

and provides:

```java
getRadius()
setRadius()
```

to control access to the radius.

## 📂 Project Structure

```text
Main.java
Circle.java
Cube.java
Drawable.java
Shape.java
ThreeDShape.java
input.txt
output.txt
```

## 📥 Input

The program reads the number of shapes and their types and dimensions from `input.txt`.

Example:

```text
2
Circle 10
Cube 5
```

## 📤 Output

The program calculates the area of each shape and the total area.

The total is saved in:

```text
output.txt
```

Example:

```text
Sum of Areas = ...
```

## 🖥️ GUI

The project also includes a simple Java Swing GUI that displays the created shapes.

The `drawGUI()` method creates a `JFrame` and uses `Graphics` to draw the shapes.

The size of the shapes is controlled using:

```java
SCALE = 3.0;
```

## 🎯 What I Practiced

Through this project, I practiced:

* Classes and Objects
* Abstract Classes
* Interfaces
* Inheritance
* Polymorphism
* Encapsulation
* Method Overriding
* Arrays of Objects
* File Reading
* File Writing
* Exception Handling
* Java Swing GUI
* Basic Graphics Drawing

## 🚀 How to Run

1. Clone the repository.
2. Open the project in a Java IDE such as IntelliJ IDEA, NetBeans, or Eclipse.
3. Make sure `input.txt` is available in the correct project location.
4. Run `Main.java`.
5. The program will read the input, calculate the areas, create `output.txt`, and display the shapes in the GUI.
