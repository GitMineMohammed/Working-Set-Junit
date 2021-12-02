package org.junit;

import java.io.IOException;
import java.util.Date;

import org.baseClass.BaseClass_Junit;
import org.openqa.selenium.WebElement;
import org.pom.Junit_POM_Adactin_Booking;
import org.pom.Junit_POM_Adactin_Booking_Confirmation;
import org.pom.Junit_POM_Adactin_Login;
import org.pom.Junit_POM_Adactin_PersonalDetails;

public class Utilization_Adactin_Junit extends BaseClass_Junit{

@BeforeClass
public static void browserLaunch() {
chromeLaunch("http://adactinhotelapp.com/");
String title = driver.getTitle();	
boolean contains = title.contains(title);
Assert.assertTrue(contains);
System.out.println(title);}

//--------------------------------------------------------------------------------------------------------------------------------------------
@Before
public void timeBeforeloginPage() {
Date d = new Date ();
System.out.println("Start Time of loginPage : "+d); }

@Test
public void testCase1() throws IOException {

Junit_POM_Adactin_Login a = new Junit_POM_Adactin_Login();
	
WebElement username = a.getUsername();
String readusername = a.readExcelToWebPage("C:\\Users\\Bismillah\\Desktop\\Test Read\\Read Excel File.xlsx", "Adactin Booking", 0, 1);
enterText(username, readusername);

WebElement password = a.getPassword();
String readpassword = a.readExcelToWebPage("C:\\Users\\Bismillah\\Desktop\\Test Read\\Read Excel File.xlsx", "Adactin Booking", 1, 1);
enterText(password, readpassword);

WebElement login = a.getLogin();
login.click(); }

@After
public void timeAfterloginPage() {
Date d = new Date ();
System.out.println("End Time of loginPage : "+d); }
//--------------------------------------------------------------------------------------------------------------------------------------------
@Before
public void timeBeforebookingPage() {
Date d = new Date ();
System.out.println("Start Time of bookingPage : "+d); }

@Test
public void testCase2() throws IOException {

Junit_POM_Adactin_Booking a = new Junit_POM_Adactin_Booking();

WebElement location = a.getLocation();
String readlocation = a.readExcelToWebPage("C:\\Users\\Bismillah\\Desktop\\Test Read\\Read Excel File.xlsx", "Adactin Booking", 2, 1);
enterText(location, readlocation);

WebElement hotel = a.getHotel();
String readhotel = a.readExcelToWebPage("C:\\Users\\Bismillah\\Desktop\\Test Read\\Read Excel File.xlsx", "Adactin Booking", 3, 1);
enterText(hotel, readhotel);

WebElement roomType = a.getRoomType();
String readroomType = a.readExcelToWebPage("C:\\Users\\Bismillah\\Desktop\\Test Read\\Read Excel File.xlsx", "Adactin Booking", 4, 1);
enterText(roomType, readroomType);

WebElement roomNos = a.getRoomNos();
String readroomNos = a.readExcelToWebPage("C:\\Users\\Bismillah\\Desktop\\Test Read\\Read Excel File.xlsx", "Adactin Booking", 5, 1);
enterText(roomNos, readroomNos);

WebElement datepickin = a.getDatepickin();
datepickin.clear();
String readdatepickin = a.readExcelToWebPage("C:\\Users\\Bismillah\\Desktop\\Test Read\\Read Excel File.xlsx", "Adactin Booking", 6, 1);
enterText(datepickin, readdatepickin);

WebElement datepickout = a.getDatepickout();
datepickout.clear();
String readdatepickout = a.readExcelToWebPage("C:\\Users\\Bismillah\\Desktop\\Test Read\\Read Excel File.xlsx", "Adactin Booking", 7, 1);
enterText(datepickout, readdatepickout);

WebElement adultroom = a.getAdultroom();
String readadultroom = a.readExcelToWebPage("C:\\Users\\Bismillah\\Desktop\\Test Read\\Read Excel File.xlsx", "Adactin Booking", 8, 1);
enterText(adultroom, readadultroom);

WebElement childroom = a.getChildroom();
String readchildroom = a.readExcelToWebPage("C:\\Users\\Bismillah\\Desktop\\Test Read\\Read Excel File.xlsx", "Adactin Booking", 9, 1);
enterText(childroom, readchildroom);

WebElement search = a.getSearch();
search.click(); }

@After
public void timeAfterbookingPage() {
Date d = new Date ();
System.out.println("End Time of bookingPage : "+d); }
//--------------------------------------------------------------------------------------------------------------------------------------------
@Before
public void timeBeforeContinuePage() {
Date d = new Date ();
System.out.println("Start Time of ContinuePage : "+d); }

@Test
public void testCase3() throws IOException, InterruptedException {

Junit_POM_Adactin_Booking_Confirmation a = new Junit_POM_Adactin_Booking_Confirmation();	

WebElement radiobutton = a.getRadiobutton();
a.buttonClick(radiobutton);

WebElement continueBooking = a.getContinueBooking();
a.buttonClick(continueBooking);}

@After
public void timeAfterContinuePage() {
Date d = new Date ();
System.out.println("End Time of ContinuePage : "+d); }
//--------------------------------------------------------------------------------------------------------------------------------------------

@Before
public void timeBeforePersonalDetailsPage() {
Date d = new Date ();
System.out.println("Start Time of ContinuePage : "+d); }

@Test
public void testCase4() throws IOException, InterruptedException {

Junit_POM_Adactin_PersonalDetails a = new Junit_POM_Adactin_PersonalDetails();

WebElement firstname = a.getFirstname();	
String readfirstname = a.readExcelToWebPage("C:\\Users\\Bismillah\\Desktop\\Test Read\\Read Excel File.xlsx", "Adactin Booking", 10, 1);
enterText(firstname, readfirstname);

WebElement lastname = a.getLastname();
String readlastname = a.readExcelToWebPage("C:\\Users\\Bismillah\\Desktop\\Test Read\\Read Excel File.xlsx", "Adactin Booking", 11, 1);
enterText(lastname, readlastname);

WebElement address = a.getAddress();
String readaddress = a.readExcelToWebPage("C:\\Users\\Bismillah\\Desktop\\Test Read\\Read Excel File.xlsx", "Adactin Booking", 12, 1);
enterText(address, readaddress);

WebElement ccNum = a.getCcNum();
String readccNum = a.readExcelToWebPage("C:\\Users\\Bismillah\\Desktop\\Test Read\\Read Excel File.xlsx", "Adactin Booking", 13, 1);
enterText(ccNum, readccNum);

WebElement ccType = a.getCcType();
String readccType = a.readExcelToWebPage("C:\\Users\\Bismillah\\Desktop\\Test Read\\Read Excel File.xlsx", "Adactin Booking", 14, 1);
enterText(ccType, readccType);

WebElement ccExpMo = a.getCcExpMo();
String readccExpMo = a.readExcelToWebPage("C:\\Users\\Bismillah\\Desktop\\Test Read\\Read Excel File.xlsx", "Adactin Booking", 15, 1);
enterText(ccExpMo, readccExpMo);

WebElement ccExpYr = a.getCcExpYr();
String readccExpYr = a.readExcelToWebPage("C:\\Users\\Bismillah\\Desktop\\Test Read\\Read Excel File.xlsx", "Adactin Booking", 16, 1);
enterText(ccExpYr, readccExpYr);

WebElement ccCVV = a.getCcCVV();
String readccCVV = a.readExcelToWebPage("C:\\Users\\Bismillah\\Desktop\\Test Read\\Read Excel File.xlsx", "Adactin Booking", 17, 1);
enterText(ccCVV, readccCVV);

WebElement bookNow = a.getBookNow();
bookNow.click();

Thread.sleep(7000);
WebElement orderId = a.getOrderId();
String attribute = a.getAttribute(orderId);
a.writeExcelFromWebPage("C:\\Users\\Bismillah\\Desktop\\Test Write\\Write Excel File.xlsx", "Adactin Booking", 1, 1, attribute); }

@After
public void timeAfterPersonalDetailsPage() {
Date d = new Date ();
System.out.println("End Time of ContinuePage : "+d); }
//--------------------------------------------------------------------------------------------------------------------------------------------
@AfterClass
public static void browserClosure() {
driver.quit(); 
} }
