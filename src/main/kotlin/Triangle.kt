import kotlin.math.sqrt
class Triangle (_name: String) : Shape(_name) {
    var side1: Double = 0.0
    var side2: Double = 0.0
    var side3: Double = 0.0

    fun setDimensions(side1 : Double, side2 : Double, side3 : Double) {
        this.side1 = side1
        this.side2 = side2
        this.side3 = side3
    }

    override fun printDimensions() {
        val area = getArea()
        println("Area: $area")
    }

    override fun getArea() : Double {
        val s = (side1 + side2 + side3) / 2
        return sqrt((s * (s - side1) * (s - side2) * (s - side3)).toDouble())
    }

}