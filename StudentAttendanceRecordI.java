class StudentAttendanceRecordI {
    public boolean checkRecord(String s) {
        int absent = 0, late = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                absent++;
                late = 0;
            } else if (s.charAt(i) == 'L')
                late++;
            else
                late = 0;
            if (absent >= 2 || late >= 3)
                return false;
        }
        return true;
    }
}