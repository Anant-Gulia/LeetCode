class NumberOfSegmentsInAString{
    public int countSegments(String s) {
        int count = 0, temp = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' ')
                temp = 1;
            if(temp == 1 && s.charAt(i) == ' '){
                count++;
                temp = 0;
            } 
        }
        if(temp == 1)
            count++;
        return count;
    }
}