class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
     //topo sort using Kahn's algo"
    int[] inDegree = new int[numCourses];
    List<List<Integer>> adj = new ArrayList<>();
    //for each course w indegree 0 in numCourse
    Queue<Integer> q = new LinkedList<>();

    for(int i = 0; i < numCourses; i++){
        adj.add(new ArrayList<>());
    }
    for(int[] pre : prerequisites){//0th element- course
    //1st element- prerequisite
        inDegree[pre[1]]++;
        adj.get(pre[0]).add(pre[1]);
    }
    for(int i = 0; i < numCourses; i++){
        if(inDegree[i] == 1){
            q.add(i);
        }
    }
    int finish = 0;
    while(!q.isEmpty()){
        int node = q.poll();//remove from front
        finish++;
        for(int n : adj.get(node)){
            //get list for that node
            inDegree[node]--;
            if(inDegree[node] == 0){
                q.add(node);
            }
        }
    }
    return finish == numCourses;


    }
}
