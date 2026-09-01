## Aug 15

This project is my first Java program that I developed. 

After reading the assignment and it's requirements there was some push back because of my own opinions of Java as a language. The infamous verbose language with it's classes and syntax that repels many developers to chose quite literally any other language. Personally, I would rather write all my code in C or Rust (despite it's complexity and small percentage of developers who know how to code or read Rust), nontheless I didn't shy away from the challenge.

I intend on writing 60-70% of the code in Java with the 30-40% of it in C (this is my "flair" if you will to all the code I write) to respect the Java requirement given by in the assignment. 

The project needs to standout from the rest of the projects that will be developed for this assignment without defaulting to the bare minimum code that gets the program to run in the CLI. 
For the sake of not having to get too carried away, the GUI will be simple.

### 14:28

- Started research into _Project Panama_ by Oracle that allows Java to make calls to C. What is _Project Panama_ really? According to [Atri Sarkar from Medium.com](https://medium.com/@atrisarkar91/calling-c-from-java-the-easy-way-project-panama-ce68bff0c865), _Project Panama_ is how the developer can interact with C code from Java via it's OpenJDK. Java excutes bytecode that is compiled from the source on the JVM, which means that there's an undesirable amount of performance overhead for certain CPU intensive tasks. While this is a simple program, the point is to not have any performance issues on less powerful CPUs. This will also give me more control over the memory that Java doesn't allow on the lower level. 
- Started with the code making use of `java.util.Scanner` to take input from the user. In it's current state it runs in the terminal, development of the GUI will begin once the program runs well and passes it's tests.

## Sep 1

I'm picking up from where I last left off. 

- Made changes to the naming convention of the code