class Solution:
    def orangesRotting(self, grid: List[List[int]]) -> int:
        rotten = collections.deque()
        fresh = 0;
        time = 0;

        rows = len(grid)
        cols = len(grid[0])

        for i in range(rows):
            for j in range(cols):
                if(grid[i][j] == 1):
                    fresh+=1
                    continue;
                if(grid[i][j] == 2):
                    rotten.append((i, j));
        
        directions = [[0, 1], [0, -1], [1, 0], [-1, 0]]
        while rotten and fresh > 0:
            for i in range(len(rotten)):
                r, c = rotten.popleft();
                
                for rowadj, coladj in directions:
                    row = r + rowadj
                    col = c + coladj
                    if(row in range(rows)
                    and col in range(cols)
                    and grid[row][col] == 1):
                        grid[row][col] = 2;
                        fresh-=1
                        rotten.append((row, col))
            time+=1
        
        if(fresh == 0):
            return time

        return -1


