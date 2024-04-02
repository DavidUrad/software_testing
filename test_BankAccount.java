import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import product.BankAccount;

public class BankTest {
    BankAccount firstBankAccount;
    BankAccount secondBankAccount;

    @Given("Bank account with {int}kc")
    public void bankAccountWithKc(int initialBalance) {
        firstBankAccount = new BankAccount(initialBalance);
    }

    @And("another Bank account with {int}kc")
    public void anotherBankAccountWithKc(int initialBalance) {
        secondBankAccount = new BankAccount(initialBalance);
    }

    @When("A user withdraw {int}kc")
    public void aUserWithdrawKc(int withdrawAmount) {
        firstBankAccount.withdraw(withdrawAmount);
    }

    @And("A user transfer {int}kc to this accouny")
    public void aUserTransferKcToThisAccouny(int transferAmount) {
        firstBankAccount.transfer(transferAmount);
    }

    @Then("A user account balance is {int}kc")
    public void aUserAccountBalanceIsKc(int expectedBalance) {
        Assertions.assertEquals(expectedBalance, firstBankAccount.getAccountBalance());
    }

    @When("A user tranfer from first bank account to second one {int}kc")
    public void aUserTranferFromFirstBankAccountToSecondOneKc(int transferAmount) {
        firstBankAccount.withdraw(transferAmount);
        secondBankAccount.transfer(transferAmount);
    }

    @And("A user second account balance is {int}kc")
    public void aUserSecondAccountBalanceIsKc(int expectedBalance) {
        Assertions.assertEquals(expectedBalance, secondBankAccount.getAccountBalance());
    }
}
