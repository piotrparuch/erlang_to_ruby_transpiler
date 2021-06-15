-module(erlang_test4).
-compile(export_all).

if_test(A) ->
  if
    A == 1 -> 1;
    A > 1 -> "wieksze";
    true -> "mniejsze"
  end.

main() ->
  A = 1,
  io:format(if_test(A)).
