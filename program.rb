def age(ageinput)
  case
  when ageinput>19
    :adult
  when ageinput>=13 and ageinput<=19
    :teen
  when ageinput>=3 and ageinput<13
    :child
  when ageinput>=1 and ageinput<3
    :toddler
  end
end

ageinput = gets.chomp("Enter some age: ")
puts("Result: #{age(ageinput)}")

