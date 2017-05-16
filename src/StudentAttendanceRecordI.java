/**
 * No.551
 * You are given a string representing an attendance record for a student. The record only contains the following three characters:
 *
 * 'A' : Absent.
 * 'L' : Late.
 * 'P' : Present.
 * A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).
 *
 * You need to return whether the student could be rewarded according to his attendance record.
 * Example 1:
 * Input: "PPALLP"
 * Output: True
 * Example 2:
 * Input: "PPALLL"
 * Output: False
 */
public class StudentAttendanceRecordI {
    public static boolean checkRecord(String s) {
        int absent=0;
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='A') absent++;
            if(absent>1) return false;
            if(i<s.length()-2){
                if(s.charAt(i)=='L'&&s.charAt(i+1)=='L'&&s.charAt(i+2)=='L') return false;
            }

        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(checkRecord("PPALLP"));
        System.out.println(checkRecord("PPALLL"));
    }
}
