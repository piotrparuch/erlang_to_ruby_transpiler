def func(a)
  return other_func()
end
def func(a, b)
  return 2
end

def other_func()
  return 0
end

func(1)
