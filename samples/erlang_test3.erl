-module(erlang_test3).
-compile(export_all).

func(A) ->
  other_func();
func(A, B) ->
  2.

main() ->
  func(1).