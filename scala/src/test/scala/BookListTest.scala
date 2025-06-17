import scala.language.postfixOps

class BookListTest extends munit.FunSuite {
  test("first line of book lsit DSL") {
    val result = add book

    assertEquals("Add Book:", result)
  }
}