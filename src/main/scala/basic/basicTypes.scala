package basic

object basicTypes extends  App {
  // Val vs Var
  val a: String = "Hello World!"
  var b:String = "This is scala"

  // below line will throw an reassignment error
  //a= "Hi world"

  // Value data types
  val c: Byte = 1
  val i: Int = 1
  val l: Long = 1
  val s: Short = 1
  val d: Double = 2.0
  val f: Float = 3.0
  val ch: Char = 'A'
  val bool: Boolean = true
  val au: Unit = () // Unit is replacement of void

  // Reference type
  val ref_type_s:String= "Hello again"


}
