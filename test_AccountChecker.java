public class AccountChecker {

    public static void main(String[] args) throws Exception {

        String accNumberCandidate = "5498754215";
        int[] weights = { 6, 3, 7, 9, 10, 5, 8, 4, 2, 1 };


        switch(accNumberCandidate.length()){

            case 10 -> {
                int[] intNumbers = new int[weights.length];
                for(int i = 0; i < accNumberCandidate.length(); i++){
                    intNumbers[i] = Character.getNumericValue(accNumberCandidate.charAt(i));
                }
                int[] components = new int[intNumbers.length];
                for(int i = 0; i < components.length; i++){
                    components[i] = weights[i] * intNumbers[i];
                }
                int dotProduct = 0;
                for(int i = 0; i < components.length; i++){
                    dotProduct = dotProduct + components[i];
                }
                String validationMsg = dotProduct % 11 == 0 ? String.format("[INFO]: accNumb: %s is valid\n", accNumberCandidate)
                        : String.format("[ERR]: accNumb: %s is invalid !!!\n", accNumberCandidate);
                System.out.println(validationMsg);
            }

            case 11 -> {
                throw new Exception("[ERR]: vstup je vacsi nez 10");
            }

            case 9 -> {
                throw new Exception("[ERR]: vstup je mensi nez 10");
            }
            default -> throw new Exception(String.format("[ERR]: hodnota %s je %s znakov, je to zle !!!", accNumberCandidate, accNumberCandidate.length()));

        }



    }

}
