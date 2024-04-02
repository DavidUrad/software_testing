import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import product.Checkout;

public class CheckoutTest {

    public Checkout checkout;

    @Before
    public void pocatecniNastaveni() {
        checkout = new Checkout();
    }

    @After
    public void vycisteniTestu() {
        checkout = null;
    }

    @Given("cena {string} je {int}kc")
    public void cenaJeKc(String jmenoProduktu, int cenaProduktu) {
        checkout.addItem(jmenoProduktu, cenaProduktu);
    }

    @When("uzivatel nakoupi {int} {string}")
    public void uzivatelNakoupi(int mnozstviProduktu, String jmenoProduktu) {
        checkout.scanItems(jmenoProduktu, mnozstviProduktu);
    }

    @Then("celkova cena je {int}kc")
    public void celkovaCenaJeKc(int celkovaCena) {
        Assertions.assertEquals(celkovaCena, checkout.totalCart());
    }
}
