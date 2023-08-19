
this design is proposed for you as a skeleton for the assignment.
however, there could be many interperations of a proper implementation - you do not have to use the proposed design.
if you do use it - you can change any part of it, and you can (and should) add classes, class members, and methods to it.

WHATEVER YOU DO - KEEP THE OUTPUT FORMAT PRECISELY AS REQUESTED!!!

to the design details.
there are two important parts to this design -

1) Algorithm::search() method. a single implementation can serve the three search algorithm (greedy, UCS, A*).
your implementation should run a loop. on each iteration, you
	(a) poll the "smallest" path (a "walk" from (1,1)...(x,y)) from the frontier of paths.
	(b) add to the frontier a set of legal "successive" paths (e.g.,(1,1)...(x,y),(x+1,y) and (1,1)...(x,y),(x-1,y)).
implement this loop only once, in the Algorithm class (and not in the extended classes Greedy, UCS, A*),
as this search method is similar in all the algorithm you are required to implement.
the algorithms differ only in their interperations for the "smallest" path (the one they poll from the frontier),
and to that end you should implement corresponding Comparators.

2) Comparators. what is the next path ("walk") to explore in each algorithm?
	(a) greedy search determines that by the distance of a walk from the goal (heuristics).
	(b) UCS determine that by the cost of the paths.
	(c) A* combines both.
you need to do two things regarding comparators -
	(a) implement all three comparators.
	(b) let each algorithm set Algorithm::comparator accordingly. e.g., GreedySearch sets Algorithm::comparator as a GreedyComparator.
part (b) happens in the constructor of the search algorithms. this is the only line one needs to add to the class in order to make the algorithm work.
