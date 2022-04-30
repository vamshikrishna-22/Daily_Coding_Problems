import java.util.*;
public class Day23 {
    public static class cell {
        int x, y;
        //int dis;

        public cell(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String [] args) {
        int [] row = {1,-1,0,0};
        int [] column = {0,0,1,-1};
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int startx = in.nextInt();
        int starty = in.nextInt();
        int endx = in.nextInt();
        int endy = in.nextInt();
        char [][] arr = new char[m][n];
        for(int i = 0;i<m;i++) {
            for(int j = 0;j<n;j++) {
                arr[i][j] = in.next().charAt(0);
            }
        }
//        for(int i = 0;i<m;i++) {
//            for(int j = 0;j<n;j++) {
//                System.out.println(arr[i][j]);
//            }
//        }
        if(!issafe(startx,starty,m,n) || !issafe(endx,endy,m,n)) {
            System.out.println("null");
            System.exit(0);
        }
        int count = 0;
        Queue<cell> q = new LinkedList<cell>();
        q.add(new cell(startx,starty));
        cell t;
        boolean [][] visited = new boolean [m+1][n+1];
        for(int i = 0;i<m+1;i++) {
            for(int j= 0;j<n+1;j++) {
                visited[i][j] = false;
            }
        }
        while(!q.isEmpty()) {
            int x = q.size();
            while (x != 0) {
                t = q.peek();
                q.remove();
                for (int i = 0; i < 4; i++) {
                    if (t.x + row[i] < 4 && t.y + column[i] < 4 && issafe(t.x + row[i], t.y + column[i], m, n) && !(visited[t.x + row[i]][t.y + column[i]])) {
                        if (arr[t.x + row[i]][t.y + column[i]] == 'f') {
                            visited[t.x + row[i]][t.y + column[i]] = true;
                            q.add(new cell(t.x + row[i], t.y + column[i]));
                        }
                        if (t.x + row[i] == endx && t.y + column[i] == endy) {
                            System.out.println(count + 1);
                            break;
                        }
                    }
                }
                x--;
            }
            count++;
        }
    }
    public static boolean issafe(int x,int y,int a,int b) {
        return !(x < 0 || y < 0 || x>a || y > b);
    }
}
