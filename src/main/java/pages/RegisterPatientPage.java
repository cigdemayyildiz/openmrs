package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BrowserUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RegisterPatientPage {

    public RegisterPatientPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "givenName")
    WebElement givenName;

    @FindBy(name = "familyName")
    WebElement familyName;

    @FindBy(id = "next-button")
    WebElement nextButton;

    @FindBy(id = "gender-field")
    WebElement gender;

    @FindBy(name = "birthdateDay")
    WebElement birthDay;

    @FindBy(name = "birthdateMonth")
    WebElement birthMonth;

    @FindBy(name = "birthdateYear")
    WebElement birthYear;

    @FindBy(id = "address1")
    WebElement address;

    @FindBy(name = "phoneNumber")
    WebElement phoneNumber;

    @FindBy(id = "relationship_type")
    WebElement relationshipType;

    @FindBy(xpath = "//input[@placeholder='Person Name']")
    WebElement personName;

    @FindBy(id = "dataCanvas")
    List<WebElement> allData;

    public void registerPatient(String givenName, String familyName, String gender, String birthDay,
                                String birthMonth, String birthYear, String address, String phoneNumber,
                                String relationshipType, String personName){
        this.givenName.sendKeys(givenName);
        this.familyName.sendKeys(familyName);
        nextButton.click();
        BrowserUtils.selectBy(this.gender, gender, "text");
        nextButton.click();
        this.birthDay.sendKeys(birthDay);
        BrowserUtils.selectBy(this.birthMonth, birthMonth, "text");
        this.birthYear.sendKeys(birthYear);
        nextButton.click();
        this.address.sendKeys(address);
        nextButton.click();
        this.phoneNumber.sendKeys(phoneNumber);
        nextButton.click();
        BrowserUtils.selectBy(this.relationshipType, relationshipType, "text");
        this.personName.sendKeys(personName);
        nextButton.click();
    }

    public List<String> getAllData(){
        List<String> allPatientData = new ArrayList<>();
        for (WebElement data : allData){
            allPatientData.add(data.getText().trim());
        }
        return allPatientData;
    }
}
