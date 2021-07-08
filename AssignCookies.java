class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int answer = 0, childIndex = 0, cookieIndex = 0;
        while(childIndex  < g.length && cookieIndex  < s.length) {
            if(g[childIndex ] <= s[cookieIndex ]) {
                answer++;
                childIndex++;
                cookieIndex++;
            } else
                cookieIndex++;
        }
        return answer;
    }
}