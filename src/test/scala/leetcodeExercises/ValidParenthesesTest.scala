package leetcodeExercises

import org.scalatest.funsuite.AnyFunSuiteLike

class ValidParenthesesTest extends AnyFunSuiteLike {

  test("test1"){
    val result = ValidParentheses.validateParenthesis("(()){(})")
    assert(result==false)
  }

  test("test2") {
    val result = ValidParentheses.validateParenthesis("(()){([])}")
    assert(result == true)
  }
}