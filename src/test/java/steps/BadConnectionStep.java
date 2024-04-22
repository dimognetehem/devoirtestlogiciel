package steps;

import com.automatisation.test.pageObjects.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BadConnectionStep {

    private HomePage homePage = new HomePage();

    @Given("user to the homepage")
    public void userToTheHomePage() {
        homePage.navigateToHomePage();
    }

    @When("user click avatar")
    public void ClickOnAvatar() {
        homePage.openModal();
    }

    @When("bad login")
    public void userFakeLogin() {
        homePage.setUsername("fake@gmail.com"); // Remplacez "your_username" par le nom d'utilisateur que vous voulez utiliser pour le test
    }

    @When("bad password")
    public void userFakePassword() {
        homePage.setPassword("9999999");
    }

    @When("user clicks the connection button")
    public void clicLoginButton(){
        homePage.clickLogin();
    }

    @Then("error connection")
    public void UserNotConnected(){
        homePage.badConnection();
        System.out.println("L'utilisateur n'est pas connecté");
    }

}
