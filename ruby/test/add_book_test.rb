require 'test/unit'
require_relative '../src/add_book_dsl.rb'

class AddBookTest < Test::Unit::TestCase
  def test_first_line
    result = add book

    assert_equal('Add Book:', result)
  end

  def test_second_line
    result = add book
      type 'Web Novel'

    assert_equal('Add Book: Web Novel', result)
  end

  def test_third_line
    result = add book
      type 'Web Novel'
      title "King's Avatar"

    assert_equal('Add Book: Web Novel titled King\'s Avatar', result)
  end
end
