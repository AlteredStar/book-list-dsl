import scala.language.dynamics

object add extends Dynamic {
  var bookDetails = new StringBuilder()

  def book =
    bookDetails.append(s"Add Book:")
    bookDetails.result

  def book(bookBlock : add.type => add.type) =
    bookDetails = new StringBuilder().append(s"Add Book:")
    bookBlock(this)
    bookDetails.result

  infix def typed(bookType : String) =
    bookDetails.append(s" ${bookType}")
    this

  infix def titled(bookTitle : String) =
    bookDetails.append(s" titled ${bookTitle}")
    this

  infix def language(bookOrigin : String) =
    bookDetails.append(s" from ${bookOrigin}")
    this
}
