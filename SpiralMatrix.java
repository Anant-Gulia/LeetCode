class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        int rowStart = 0, rowEnd = matrix.length - 1, columnStart = 0, columnEnd = matrix[0].length - 1, i = 0;        
        while(rowStart <= rowEnd && columnStart <= columnEnd) {
            for(i = columnStart; i <= columnEnd; i++)
                list.add(matrix[rowStart][i]);
            rowStart++;
            for(i = rowStart; i <= rowEnd; i++)
                list.add(matrix[i][columnEnd]);
            columnEnd--;
            if(rowStart <= rowEnd) {
                for(i = columnEnd; i >= columnStart; i--)
                    list.add(matrix[rowEnd][i]);
            }
            rowEnd--;
            if(columnStart <= columnEnd) {
                for(i = rowEnd; i >= rowStart; i--)
                    list.add(matrix[i][columnStart]);
            }
            columnStart++;
        }        
        return list;
    }
}