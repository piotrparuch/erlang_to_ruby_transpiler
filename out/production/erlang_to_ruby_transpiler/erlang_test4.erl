-module(erlang_test4).
-compile(export_all).

if_test(A) ->
  if
    A == 1 -> io:format("1");
    A > 1 -> io:format("winksze");
    true -> io:format("mniejsze")
  end.