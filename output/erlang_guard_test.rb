def age(ageinput)
  case
  when ageinput>19
    :adult
  when ageinput>=13; ageinput<=19
    :teen
  when ageinput>=3; ageinput<13
    :child
  when ageinput>=1; ageinput<3
    :toddler
  end
end

puts("Enter some age: ")
ageinput = gets.chomp
puts("Result: #{age(ageinput)}")

