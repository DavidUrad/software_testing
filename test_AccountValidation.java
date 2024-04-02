public class AccountValidation {

    public static boolean validateAccNumber(AccountInfo accountInfo) throws Exception {

        int accNumLength = accountInfo.getAccNumberLength();
        String accNumber = accountInfo.getAccountNumber();

        int[] weights = {6, 3, 7, 9, 10, 5, 8, 4, 2, 1};

        boolean vysledok;
        switch (accNumLength) {
            case 10 -> {
                int[] intNumbers = new int[weights.length];
                for (int i = 0; i < accNumLength; i++) {
                    intNumbers[i] = Character.getNumericValue(accNumber.charAt(i));
                }
                int[] components = new int[intNumbers.length];
                for (int i = 0; i < components.length; i++) {
                    components[i] = weights[i] * intNumbers[i];
                }
                int dotProduct = 0;
                for (int i = 0; i < components.length; i++) {
                    dotProduct = dotProduct + components[i];
                }
                vysledok = dotProduct % 11 == 0 ? true : false;
            }
            case 11 -> {
                throw new Exception("[ERR]: vstup je vacsi nez 10");
            }
            case 9 -> {
                throw new Exception("[ERR]: vstup je mensi nez 10");
            }
            default -> throw new Exception(String.format("[ERR]: hodnota: %s je %s znakov, je to zle!!!\n", accNumber, accNumLength));
        }
        return vysledok;
    }
}
