class Solution {
    public int maxPoints(int[][] points) {
        
        if(points.length<=2) return points.length;

        int answer = 2;

        for(int i=0;i<points.length;i++){
            HashMap<String , Integer> map = new HashMap<>();

            int localmax=0;

            for(int j=i+1;j<points.length;j++){

                int dx=points[j][0]-points[i][0];
                int dy=points[j][1]-points[i][1];

                int g=gcd(dy,dx);
                dx/=g;
                dy/=g;
            
                if(dx<0){
                    dx=-dx;
                    dy=-dy;
                }

                if (dx == 0) {
                    dy = 1;
                }

                if (dy == 0) {
                    dx = 1;
                }

                String p=dy+"/"+dx;
                map.put(p,map.getOrDefault(p,0)+1);

                localmax=Math.max(localmax,map.get(p));

            }
            answer=Math.max(answer,localmax+1);
        }
            return answer;
    }
    int gcd(int a, int b){
        if(b==0){
            return Math.abs(a);

        }
        return gcd(b,a%b);
    }
}