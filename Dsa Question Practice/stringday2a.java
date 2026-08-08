/*
 Give a route cantaining 4 direction (E,W,N,S);
 You are given a sequence of unit moves on a 2D grid. 
 Each move is one of the four cardinal directions: E (east), W (west), N (north), S (south). 
 Starting at the origin (0,0), the sequence of moves leads to some destination (x, y).

 find the shortest path to reach destination.
  
 given path is :  "W N E E N E S E N N N"
 E = east
 W = west
 N = north
 S = south
 */
public class stringday2a {
    public static float shortestPath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            if(dir=='W'){
                x--;
            }
            else if(dir=='E'){
                x++;
            }
            else if(dir=='N'){
                y++;
            }
            else{
                y--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args){
        String path="WNEENESENNN";
        System.out.println(shortestPath(path));  
    }
}
