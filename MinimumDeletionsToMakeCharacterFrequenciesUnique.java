class MinimumDeletionsToMakeCharacterFrequenciesUnique {
    public int minDeletions(String s) {
        int[] arr = new int[26];
        int i = 0, answer = 0;
        for (i = 0; i < s.length(); i++)
            arr[s.charAt(i) - 'a']++;
        Arrays.sort(arr);
        for (i = 24; i >= 0 && arr[i] != 0; i--) {
            if (arr[i] == arr[i + 1]) {
                arr[i]--;
                answer++;
            } else if (arr[i] > arr[i + 1]) {
                if (arr[i + 1] == 0 || arr[i + 1] == 1) {
                    answer += arr[i];
                    arr[i] = 0;
                } else {
                    answer += arr[i] - arr[i + 1] + 1;
                    arr[i] -= arr[i] - arr[i + 1] + 1;
                }
            }
        }
        return answer;
    }
}