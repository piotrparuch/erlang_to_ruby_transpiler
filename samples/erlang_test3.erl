-module(erlang_test3).
-compile(export_all).

func(A) ->
  exAtom;
func(A, B) ->
  2.
other_func() -> 0.

main() ->
  func(1, 2).