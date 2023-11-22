package testSuite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import category.HighPriorityTestCases;
import category.SanityTests;
import category.SmokeTest;
import testCases.AccountDashTestCases;
import testCases.AccountsReportTestCases;
import testCases.AttendanceTestCases;
import testCases.BankReconTestCases;
import testCases.DeliveryChallanTestCases;
import testCases.EmployeeTestCases;
import testCases.ExpenseTestCases;
import testCases.GeneralPOTestcases;
import testCases.ICDTestcases;
import testCases.IRTestCases;
import testCases.IndentTestCases;
import testCases.InvoiceTestCases;
import testCases.IssueTestCases;
import testCases.JobInReturnDC;
import testCases.LedgerTestCases;
import testCases.LoginTestCases;
import testCases.ManualNoteTestcases;
import testCases.MaterialTestCases;
import testCases.OATestCases;
import testCases.PartyTestCases;
import testCases.PayStructTestCases;
import testCases.PurchaseReportTestCases;
import testCases.QuickPOTestCases;
import testCases.ReceiptDCTestCases;
import testCases.ReceiptJOTestCases;
import testCases.ReceiptJobInTestCases;
import testCases.ReceiptOthersTestCases;
import testCases.ReceiptPOTestcases;
import testCases.ReceiptWithNWithoutJO;
import testCases.ReceiptWithWithoutPO;
import testCases.SalesEstimate;
import testCases.SalesReportTestCases;
import testCases.SalesReturnTestCases;
import testCases.SanityTestCases;
import testCases.StatementsTestCases;
import testCases.StoresReportTestCases;
import testCases.TaxTestCases;
import testCases.UserTestCases;
import testCases.VoucherTestcases;

@RunWith(Categories.class)
@Categories.IncludeCategory({SmokeTest.class, SanityTests.class})
@Suite.SuiteClasses({DeliveryChallanTestCases.class})
public class TestSuite {

}
