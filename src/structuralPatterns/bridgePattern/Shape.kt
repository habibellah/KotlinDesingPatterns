package structuralPatterns.bridgePattern
/*here is the abstraction side where the shape build has a method drawShape will print the shape with its color
,and it will take in its constructor a variable with IColor type will decide the color of the shape
 */
abstract class Shape (protected val color:IColor){
    abstract fun drawShape()
}