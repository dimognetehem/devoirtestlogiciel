package steps;

import com.automatisation.test.pageObjects.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeStep {

    private HomePage homePage = new HomePage();

    @Given("user in the homepage")
    public void userInTheHomePage() {
        homePage.navigateToHomePage();
    }

    @When("user click avatar in navbar")
    public void userClickAvatar() {
        homePage.openModal();
    }

    @When("user enters login")
    public void userEntersLogin() {
        homePage.setUsername("dimognetehem@gmail.com"); // Remplacez "your_username" par le nom d'utilisateur que vous voulez utiliser pour le test
    }


    @When("user enters password")
    public void userEntersPassword() {
        homePage.setPassword("12345678"); // Remplacez "your_password" par le mot de passe que vous voulez utiliser pour le test
    }

    @When("user clicks on the connection button")
    public void clickLoginButton(){
        homePage.clickLogin();
    }


    @Then("the connection is established and the test ends")
    public void UserConnected(){
        System.out.println("L'utilisateur est connecté");
    }


}
