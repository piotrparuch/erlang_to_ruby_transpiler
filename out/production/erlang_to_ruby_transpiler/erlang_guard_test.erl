-module(erlang_guard_test).
-compile(export_all).

age(AgeInput) when AgeInput > 19 ->
  adult;
age(AgeInput) when AgeInput >= 13, AgeInput =< 19 ->
  teen;
age(AgeInput) when AgeInput >= 3, AgeInput < 13 ->
  child;
age(AgeInput) when AgeInput >= 1, AgeInput < 3 ->
  toddler.

main() ->
  {ok, AgeInput} = io:read("Enter some age: "),
  io:format("Result: ~w~n", [age(AgeInput)]).
