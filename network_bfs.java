package algo_java;
import java.util.Queue;
import java.util.LinkedList;

public class network_bfs {
	static class Pair{
        int x,y;
        Pair(int x,int y){
            this.x = x;
            this.y = y;
        }
    }
	public static int dx[] = {1,0,-1,0};
    public static int dy[] = {0,1,0,-1};
    
    static int[][] vis = new int[201][201];
    static int cnt = 0;
    
	public static void bfs(int a, int b, int n, int[][] computers) {
		Queue<Pair> queue = new LinkedList<>();
		queue.offer(new Pair(a,b));
		vis[a][b] = 1;
		cnt++;
		while(!queue.isEmpty()) {
			Pair p = queue.poll();
			System.out.println(p.x + " " + p.y);
			for(int i = 0;i<4;i++) {
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];
				if(nx < 0 || ny < 0 || nx>= n || ny>=n) {
					continue;
				}
				if(vis[nx][ny] == 0 && computers[nx][ny]==1) {
					vis[nx][ny] = 1;
					queue.offer(new Pair(nx,ny));
				}
			}
		}
		
	}
	public static int solution(int n, int[][] computers) {
		int answer = 0;
		
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				if(vis[i][j] == 0 && computers[i][j]==1) {
					bfs(i, j, n, computers);
				}
			}
		}
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				System.out.print(vis[i][j]);
			}
			System.out.println("");
		}
		answer = cnt;
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
		
		System.out.println(solution(n, computers));

	}

}
