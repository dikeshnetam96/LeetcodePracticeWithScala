package leetcodeExercises

import org.junit.jupiter.api.Test
import org.scalatest.funsuite.AnyFunSuiteLike

class FindSingleNumberTest extends AnyFunSuiteLike {

  test("Test 1") {
    val myList: Array[Int] = Array(1, 2, 2, 4, 4)
    val expeted = 1
    val actual = FindSingleNumber.findNumber(0, myList.length - 1, 0, myList)
    assert(expeted == actual)
  }

}
