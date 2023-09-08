fun main() {
    // Create a Square and set its dimensions
    val square = Square("My Square")
    square.setDimensions(4.0, 4.0)
    println("Area of ${square.name}: ${square.getArea()}")

    // Create a Circle and set its radius
    val circle = Circle("My Circle")
    circle.setDimensions(5.0)
    println("Area of ${circle.name}: ${circle.getArea()}")

    // Create a Triangle and set its side lengths
    val triangle = Triangle("My Triangle")
    triangle.setDimensions(3.0, 4.0, 5.0)
    println("Area of ${triangle.name}: ${triangle.getArea()}")

    // Create an EquilateralTriangle and set its side length
    val equilateralTriangle = EquilateralTriangle("My Equilateral Triangle")
    equilateralTriangle.setDimensions(4.0)
    println("Area of ${equilateralTriangle.name}: ${equilateralTriangle.getArea()}")
}