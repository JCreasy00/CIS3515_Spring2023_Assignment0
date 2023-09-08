import kotlin.math.pow

class Circle (_name: String) : Shape(_name) {
    var radius : Double = 0.0

    fun setDimensions(radius : Double) {
        this.radius = radius
    }

    override fun printDimensions() {
        val area : Double = getArea()
        println("Area of Circle: $area")
    }

    override fun getArea() : Double {
        return Math.PI * radius.pow(2.0)
    }
}