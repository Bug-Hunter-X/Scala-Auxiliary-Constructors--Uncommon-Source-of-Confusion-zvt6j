```scala
class MyClass(val value: Int) {
  def this() = this(0) 
}

val instance1 = new MyClass(5)
val instance2 = new MyClass()

println(instance1.value) // Output: 5
println(instance2.value) // Output: 0

//Example of uncommon error
class MyOtherClass(val value: String){
  def this(value: Int) = {
    this(value.toString)
  }
}
val instance3 = new MyOtherClass(10)
println(instance3.value)// Output: "10"
//This is not an error, but it is uncommon and can be confusing if you are not familiar with Scala's auxiliary constructors.
```