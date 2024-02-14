void reverseString(char* s, int sSize) {
// char* s1[sSize];
// int count = 0;
// for (int i = sSize-1; i > 0; i--) {
//     s1[count] = s[i];
//     count++;
// }
int i = 0;
int j = sSize-1;
    while (i < j) {
        int temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        i++;
        j--;
    }
}