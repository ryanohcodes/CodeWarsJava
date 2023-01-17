package org.codewars.six;

public class Xbonacci {

    public double[] tribonacci(double[] s, int n) {
        double[] ans = new double[n];
        int len = Math.min(n, s.length);
        System.arraycopy(s, 0, ans, 0, len);
        for(int i =0; i < ans.length-3;i++){
            ans[i+3] = ans[i] + ans[i+1] + ans[i+2];
        }
        return ans;
    }
}
