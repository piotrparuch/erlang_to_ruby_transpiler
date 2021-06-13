-module(erlang_test2).
-compile(export_all).

square_area() ->
  {ok, Length} = io:read("Length of the square: ").
%  io:format("Area of the square: ~w~n", [Length * Length]).