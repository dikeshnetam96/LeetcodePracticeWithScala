package leetcodeExercises

import org.scalatest.funsuite.AnyFunSuiteLike

class ValidatePalindromeTest extends AnyFunSuiteLike {

  test("test 1")  {
    val str = "A man, a plan, a canal: Panama"
    val newStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase()
    val strN = "aman"
    val newStrN = strN.replaceAll("[^a-zA-Z0-9]", "").toLowerCase()
    val isPalindrome = ValidatePalindrome.checkPalindrome(newStr)
    assert(isPalindrome)
  }

}
