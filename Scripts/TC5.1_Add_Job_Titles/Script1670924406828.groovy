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

WebUI.click(findTestObject('Object Repository/TC5.1 - Add Job Titles/a_Admin'))

WebUI.click(findTestObject('Object Repository/TC5.1 - Add Job Titles/li_Job'))

WebUI.click(findTestObject('Object Repository/TC5.1 - Add Job Titles/li_Job Titles'))

WebUI.click(findTestObject('Object Repository/TC5.1 - Add Job Titles/button_Add'))

WebUI.setText(findTestObject('Object Repository/TC5.1 - Add Job Titles/input_Job Title_oxd-input oxd-input--focus'), job_titles)

WebUI.setText(findTestObject('Object Repository/TC5.1 - Add Job Titles/textarea_Job Description_oxd-textarea oxd-t_4f7bba'), 
    jd)

WebUI.setText(findTestObject('Object Repository/TC5.1 - Add Job Titles/textarea_Note_oxd-textarea oxd-textarea--fo_bc10e6'), 
    job_note)

WebUI.click(findTestObject('Object Repository/TC5.1 - Add Job Titles/button_Save'))

WebUI.verifyElementPresent(findTestObject('Object Repository/TC5.1 - Add Job Titles/div_IT Technical Support'), 0)

WebUI.closeBrowser()

