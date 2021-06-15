-module(erlang_test5).
-compile(export_all).

print_test() ->
  io:format("This is a print without var interpolation test.").

main() ->
  print_test().