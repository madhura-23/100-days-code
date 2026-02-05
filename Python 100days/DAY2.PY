import heapq

graph = {
    'A': [('B',4), ('D',2)],
    'B': [('C',3)],
    'C': [('H',6)],
    'D': [('E',2), ('F',3)],
    'E': [('H',5)],
    'F': [('G',1)],
    'G': [('H',4)],
    'H': []
}

heuristic = {
    'A':10,
    'B':8,
    'C':7,
    'D':6,
    'E':4,
    'F':3,
    'G':1,
    'H':0
}

start, goal = 'A', 'H'

pq = []
heapq.heappush(pq, (heuristic[start], start, [start], 0))
visited = set()

while pq:
    h, node, path, cost = heapq.heappop(pq)

    if node == goal:
        print("Path Taken:", " -> ".join(path))
        print("Total Travel Time:", cost, "minutes")
        break

    visited.add(node)

    for neighbor, weight in graph[node]:
        if neighbor not in visited:
            heapq.heappush(
                pq,
                (heuristic[neighbor], neighbor, path + [neighbor], cost + weight)
            )
