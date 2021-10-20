package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HelloWorld {

    @Before
    public void runs_before_each_scenario(){
        System.out.println("Using before as hook in cucumber");
    }

    @Given("hello world")
    public void hello_world() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("# Hello world using cucumber");
    }

    @Given("I want to say blah.")
    public void i_want_to_say_blah() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("## I want to say blah");
    }

    @Given("say {string}")
    public void say(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("### Say " + string);
    }

    @Then("say multiple {string} using examples")
    public void say_multiple_using_examples(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("#### Say multiple name using examples as " + string );
    }

    @Given("say text in three dots")
    public void say_text_in_three_dots(String docString) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("##### This is the text passed by cucumber" + "\n" + docString);
    }

    @After
    public void do_something_after_scenario(){
        System.out.println("using after hook each scenario");
    }

    @After("@hello_world")
    public void only_execute_at_tag(){
        System.out.println("Only execute after @hello_world tag");
    }

    @AfterStep
    public void execute_after_each_step(){
        System.out.println("----this will execute after each step---");
    }

}
