class Solution:
    def countComponents(self, n: int, edges: List[List[int]]) -> int:
        adj = [[] for _ in range(n)]

        for u,v in edges:
            adj[u].append(v);
            adj[v].append(u);

        visited = [False]*n;

        def bfs(node):
            qu = deque([node])
            visited[node] = True
            while qu:
                cur = qu.popleft()
                for nei in adj[cur]:
                    if not visited[nei]:
                        visited[nei] = True
                        qu.append(nei)

        components = 0;

        for node in range(n):
            if not visited[node]:
                bfs(node)
                components += 1

        return components;

        