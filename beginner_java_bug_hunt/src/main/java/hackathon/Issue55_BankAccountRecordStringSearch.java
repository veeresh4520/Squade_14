public class Issue55_BankAccountRecordStringSearch {
    public static void main(String[] args) {
        String[] ids = new String[] {"A14", "B14", "C14"};
        String target = new String("B14");
        int found = 0;
        for (int i = 1; i < ids.length - 1; i++) { if (ids[i] == target) found = i; else found = i - 1; }
        System.out.println("Index=" + found);
    }
}
