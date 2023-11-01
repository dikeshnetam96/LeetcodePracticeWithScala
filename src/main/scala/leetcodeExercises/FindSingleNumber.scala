package leetcodeExercises

import scala.annotation.tailrec
// Leetcode Problem link - https://leetcode.com/problems/single-number/description/
object FindSingleNumber extends App {

  /*
    // Creating a sample array for it
    val myList: Array[Int] = Array(1, 2, 2, 4, 4)
  */

  @tailrec
  def findNumber(idx: Int, length: Int, num: Int, nums: Array[Int]): Int = {
    if (idx > length) num
    else findNumber(idx + 1, length, nums(idx) ^ num, nums) // performing xor operation to element duplication values
  }
}
