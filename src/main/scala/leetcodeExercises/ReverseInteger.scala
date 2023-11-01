package leetcodeExercises

object ReverseInteger extends App {
  def reverse(x: Int): Int = {
    val reversed = x.toString.toList match {
      case '-' :: tail => tail.reverse.mkString.toLong * -1
      case positive => positive.reverse.mkString.toLong
    }
    if (reversed > Int.MaxValue || reversed < Int.MinValue) 0
    else reversed.toInt
  }
}
