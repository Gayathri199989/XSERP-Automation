
import java.io.IOException;
import java.util.Arrays;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.j2bugzilla.base.Bug;
import com.j2bugzilla.base.BugFactory;
import com.j2bugzilla.base.BugzillaConnector;
import com.j2bugzilla.base.BugzillaException;
import com.j2bugzilla.base.BugzillaMethod;
import com.j2bugzilla.base.ConnectionException;
import com.j2bugzilla.rpc.LogIn;
import com.j2bugzilla.rpc.ReportBug;

import utility.Constant;


public class BugzillaConnectorIT {
	
	String url = "http://dev.permisso.in/bugzilla/?api_key=BQL3JdHxaQcSQixoL92e3HJpR2xDPUDs0sXstpsa";

	@Test	
	public void testConnect() throws ConnectionException, BugzillaException {
		try {
//		BugzillaConnector conn = new BugzillaConnector();
//		
//		conn.connectTo(url);
////		BugzillaMethod logIn = new LogIn("niranjani.j@schnellenergy.com", "welcome");
//		
////		conn.executeMethod(logIn);
//		
//		  LogIn logIn = new LogIn("niranjani.j", "welcome");
//		  conn.executeMethod(logIn);
//		  Bug bug = new BugFactory().newBug().setProduct("xserp").setComponent("Accounts").setVersion("2.17.2")
//		    		.setPlatform("PC").setOperatingSystem("Windows XP").setDescription("Settle bill with advance test case failed ").setSummary("Settle bill with advance test case failed ").createBug();
//		    ReportBug report = new ReportBug(bug);
//		    conn.executeMethod(report);
//			Constant.createBug("Accounts","Test " );
			String a = createBug();
			if(a != null){
				Constant.log.info("Verify if ICD is Verified for GRN JO with Non stock  test case is successful");
			}
		} catch(Exception e) {
			e.printStackTrace();
			}
	}

	public String createBug() throws IOException{
		PostMethod method = null;
		try{
			String serverURL = "http://dev.permisso.in/bugzilla/?api_key=BQL3JdHxaQcSQixoL92e3HJpR2xDPUDs0sXstpsa";
		    HttpClient client = new HttpClient();
		    method = new PostMethod(serverURL + "/bug?username=niranjani.j&password=welcome");
		    method.addParameter("product", "FoodReplicator");
		    method.addParameter("component", "Salt");
		    method.addParameter("summary", "testing");
		    method.addParameter("version", "1.0");
		    client.executeMethod(method);
		}catch(Exception e){
			
		}
	    return method.getStatusCode() + " " + method.getResponseBodyAsString();
	}
	
//
//	public void createBug(JSONObject json) {
//        String url = "http://dev.permisso.in/bugzilla/?api_key=BQL3JdHxaQcSQixoL92e3HJpR2xDPUDs0sXstpsa";
//        Class<String> responseType = String.class;
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//        HttpEntity<String> request = new HttpEntity<String>(json.toString(), headers);
//
//        RestTemplate restTemplate = new RestTemplate();
//
//        try {
//            ResponseEntity<String> result = restTemplate.postForEntity(url, request, responseType);
//            System.out.println(result.getBody());
//        } catch(Exception e) {
//            e.printStackTrace();    
//
//        } finally {
//
//        }
//
//	}
	
//	@Test
//	public void testConnect() throws ConnectionException, BugzillaException {
//		BugzillaConnector conn = new BugzillaConnector();
//	    conn.connectTo(url);
//	    LogIn logIn = new LogIn("niranjani.j", "welcome");
//	    conn.executeMethod(logIn);
//	    Bug bug = new BugFactory().newBug().setProduct("xserp").setComponent("Accounts").setVersion("2.17.2")
//	    		.setPlatform("PC").setOperatingSystem("Windows XP").setDescription("Settle bill with advance test case failed ").setSummary("Settle bill with advance test case failed ").createBug();
//	    ReportBug report = new ReportBug(bug);
//	    conn.executeMethod(report);
////	    assertThat("Bug ID should not be -1", report.getID(), is(not(-1)));
//	}
}
