import kotlin.math.sqrt
import kotlin.math.pow

class EquilateralTriangle (_name: String) : Shape(_name) {
    var side : Double = 0.0

    fun setDimensions(side : Double) {
        this.side = side
    }

    override fun printDimensions() {
        val area : Double = getArea()
        println("Area: $area")
    }

    override fun getArea() : Double {
        return (sqrt(3.0) / 4) * side.pow(2)
    }
}