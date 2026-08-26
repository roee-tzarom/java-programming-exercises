/** Converts a base-annotated number string into an integer value. */
public class BaseNumberParser {
    public static int number2Int(String num) {
        int ans = -1;
        if (num == null || num.isEmpty()) {
            return ans;
        }

        char[] c = num.toCharArray();
        int sum = 0;
        int base = 0;
        boolean foundBase = false; // flag to indicate if 'b' was found

        // עובר על כל התוים במחרוזת
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'b') {
                // אם נמצא 'b', אנו צריכים להתחיל לקרוא את הבסיס
                foundBase = true;
                if (i + 1 < c.length) {
                    // אם הבסיס הוא מספר בין 0-9
                    if (c[i + 1] >= '0' && c[i + 1] <= '9') {
                        base = c[i + 1] - '0';
                    }
                    // אם הבסיס הוא אות בין A-F (10-15)
                    else if (c[i + 1] >= 'A' && c[i + 1] <= 'F') {
                        base = c[i + 1] - 'A' + 10;
                    }
                    else {
                        return ans; // בסיס לא חוקי
                    }
                    i++; // קופץ על התו הבא (הבסיס)
                } else {
                    return ans; // 'b' נמצא בסוף המחרוזת
                }
            } else {
                if (!foundBase) {
                    // חישוב הסכום של התוים לפני ה'b'
                    int value = 0;
                    if (c[i] >= '0' && c[i] <= '9') {
                        value = c[i] - '0';
                    } else if (c[i] >= 'A' && c[i] <= 'F') {
                        value = c[i] - 'A' + 10;
                    } else {
                        return ans; // תו לא חוקי
                    }

                    // עדכון הסכום בהתאם לערך התו
                    sum = sum * 10 + value;
                }
            }
        }

        // אם לא נמצא 'b', אנו מניחים שמדובר בבסיס 10 כברירת מחדל
        if (!foundBase) {
            base = 10;
        }

        return sum; // מחזיר את המספר שלפני ה'b'
    }
}
