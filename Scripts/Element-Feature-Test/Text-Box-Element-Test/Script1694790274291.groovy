import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.click(findTestObject('Object Repository/Element-Feature/textBox/Page_DEMOQA/div_Elements'))

WebUI.click(findTestObject('Object Repository/Element-Feature/textBox/Page_DEMOQA/span_Text Box'))

WebUI.setText(findTestObject('Object Repository/Element-Feature/textBox/Page_DEMOQA/input_Full Name_userName'), GlobalVariable.Name)

WebUI.setText(findTestObject('Object Repository/Element-Feature/textBox/Page_DEMOQA/input_Email_userEmail'), GlobalVariable.Email)

WebUI.setText(findTestObject('Object Repository/Element-Feature/textBox/Page_DEMOQA/textarea_Current Address_currentAddress'), 'USA')

WebUI.setText(findTestObject('Object Repository/Element-Feature/textBox/Page_DEMOQA/textarea_Permanent Address_permanentAddress'), 'USA')

WebUI.click(findTestObject('Object Repository/Element-Feature/textBox/Page_DEMOQA/button_Submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Element-Feature/textBox/Page_DEMOQA/p_NameAuntor Acjarja'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Element-Feature/textBox/Page_DEMOQA/p_Emailacharjeeauntorgmail.com'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Element-Feature/textBox/Page_DEMOQA/p_Current Address USA'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Element-Feature/textBox/Page_DEMOQA/p_Permananet Address USA'), 0)

WebUI.closeBrowser()

