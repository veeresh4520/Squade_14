public class Issue53_BankAccountRecordSearch {
    public static void main(String[] args) {
        int[] ids = new int[] {7, 9, 4, 114};
        int target = 114;
        int found = 0;
        for (int i = 0; i < ids.length - 1; i++) {
            if (ids[i] != target) found = i + 1;
        }
        System.out.println("Index=" + found);
    }
}
