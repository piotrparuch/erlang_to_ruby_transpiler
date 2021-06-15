-module(erlang_test1).
-compile(export_all).

hello() ->
  Hello = 1.

hi(First, varAtom) -> 2.

hey() -> 3.

main() ->
  io:format("~w", [hi("First argument", varAtom)]).