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

WebUI.callTestCase(findTestCase('Common/Login'), [('url') : GlobalVariable.URL, ('username') : GlobalVariable.USERNAME, ('password') : GlobalVariable.PASSWORD], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC3.1 - Add New Account/a_Admin'))

WebUI.click(findTestObject('Object Repository/TC3.1 - Add New Account/button_Add'))

WebUI.click(findTestObject('TC3.1 - Add New Account/div_-- Select -- role'))

WebUI.click(findTestObject('TC3.1 - Add New Account/span_ESS'))

WebUI.setText(findTestObject('Object Repository/TC3.1 - Add New Account/input'), emp_name)

WebUI.click(findTestObject('TC3.1 - Add New Account/span_xxx'))

WebUI.click(findTestObject('TC3.1 - Add New Account/div_-- Select -- status'))

WebUI.click(findTestObject('TC3.1 - Add New Account/span_Enabled'))

WebUI.click(findTestObject('Object Repository/TC3.1 - Add New Account/input_Username_oxd-input oxd-input--focus'))

WebUI.setText(findTestObject('Object Repository/TC3.1 - Add New Account/input_Username_oxd-input oxd-input--focus'), username)

WebUI.setText(findTestObject('Object Repository/TC3.1 - Add New Account/input_Password_oxd-input oxd-input--focus'), password)

WebUI.setText(findTestObject('TC3.1 - Add New Account/input_Confirm Password_oxd-input oxd-input--focus'), password)

WebUI.click(findTestObject('Object Repository/TC3.1 - Add New Account/button_Save'))

WebUI.verifyElementPresent(findTestObject('Object Repository/TC3.1 - Add New Account/div_AliceD'), 0)

WebUI.closeBrowser()

