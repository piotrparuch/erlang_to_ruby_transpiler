-module(erlang_map_test).
-compile(export_all).

main() ->
  Map1 = #{1 => "one", 2 => "two"},
  List1 = maps:to_list(Map1),
  lists:reverse(List1),
  io:format("~p", [List1]).