require 'test/unit'
require_relative '../src/add_book_dsl.rb'

class AddBookTest < Test::Unit::TestCase
  def test_first_line
    result = add book

    assert_equal('Add Book:', result)
  end
end
