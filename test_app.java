public class App {

    public static void main(String[] args) throws Exception {

        AccountInfo nasPrvyUcet = new AccountInfo("79876154564546");
        AccountInfo nasDruhyUcet = new AccountInfo("132131313131313131");


        System.out.printf("cislo uctu: %s\n", nasPrvyUcet.getAccountNumber());
        System.out.printf("dlzka c. uctu: %s\n", nasPrvyUcet.getAccNumberLength());

        System.out.printf("cislo uctu: %s\n", nasDruhyUcet.getAccountNumber());
        System.out.printf("dlzka c. uctu: %s\n", nasDruhyUcet.getAccNumberLength());

        // tu zmenime hodnoty objektov nasPrvyUcet a nasDruhyUcet pomocou ich setterov
        // a zavolame ich so zmenenymi hodnotami:
        nasPrvyUcet.setAccountNumber("45454");
        String novaHodnotaNasPrvyUcet = nasPrvyUcet.getAccountNumber();
        System.out.println(novaHodnotaNasPrvyUcet);

        System.out.println(nasPrvyUcet.AccInfoID);
        System.out.println(nasDruhyUcet.AccInfoID);

        System.out.println("-------------------------------------------------------------");
        // AccountValidation.validateAccNumber(nasPrvyUcet);
        AccountInfo validnyUcet = new AccountInfo("5498754215");
        AccountValidation.validateAccNumber(validnyUcet);

        System.out.println(AccountValidation.validateAccNumber(validnyUcet));

    }
}
