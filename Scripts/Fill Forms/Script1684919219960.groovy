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

Mobile.tap(findTestObject('Fill Forms/android.widget.TextView - Forms'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Fill Forms/android.widget.TextView - Form components'), 0)

Mobile.setText(findTestObject('Object Repository/Fill Forms/android.widget.EditText - Type something'), 'Bansos', 0)

Mobile.tap(findTestObject('Object Repository/Fill Forms/android.widget.EditText - Select an item'), 0)

Mobile.tap(findTestObject('Object Repository/Fill Forms/android.widget.CheckedTextView - This app is awesome'), 0)

CustomKeywords.'helper.SwipeDown.swipeVerticalDown'()

Mobile.tap(findTestObject('Object Repository/Fill Forms/android.widget.TextView - btnActive'), 0)

Mobile.tap(findTestObject('Object Repository/Fill Forms/android.widget.Button - OK'), 0)

