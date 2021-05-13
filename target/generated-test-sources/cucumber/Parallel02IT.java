import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"C:/Users/\u0410\u043D\u043D\u0430/IdeaProjects/new/fordeveducation/src/test/resources/Tests/ChangeInfoAboutPet.feature"},
        plugin = {"json:C:/Users/\u0410\u043D\u043D\u0430/IdeaProjects/new/fordeveducation/target/cucumber-parallel/2.json"},
        monochrome = false,
        tags = {"@petsTests"},
        glue = {"Steps"})
public class Parallel02IT {
}
