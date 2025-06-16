def add(book)
  book
end

def book
  @book_details = 'Add Book:'
end

def type(book_type)
  @book_details << " #{book_type}"
end
