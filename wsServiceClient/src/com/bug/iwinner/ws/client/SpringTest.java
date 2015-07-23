package com.bug.iwinner.ws.client;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bug.iwinner.ws.impl.BugDTO;

public class SpringTest {
	public static void main(String[] args) {
		try {
			ClassPathXmlApplicationContext classPathXmlAppContext = new ClassPathXmlApplicationContext(
					"beans.xml");
			classPathXmlAppContext.start();

			com.bug.iwinner.ws.impl.EmployeeServiceIF sampleWebService = (com.bug.iwinner.ws.impl.EmployeeServiceIF) classPathXmlAppContext
					.getBean("client");

			// System.out.println(sampleWebService.getUserMessageOps("anji"));
			java.util.List<com.bug.iwinner.ws.impl.BugDTO> listBugs = sampleWebService.getBugDetailsOps();
			for (BugDTO bug : listBugs) {
				System.out.println(bug.getBugDesc() + "  " + bug.getId() + "  "	+ bug.getBugName());
			}
			BugDTO bug=new BugDTO();
			bug.setBugDesc("spotify");
			bug.setDate(XMLCalendarToDate.toXMLGregorianCalendar(new Date()));
			bug.setBugDoubleId(10d);
            bug.setBugInfo("Spotify Info");
            bug.setBugName("Bug Name is ");
            bug.setId(10);
            bug.setBugLongId(10l);
            bug.setBugFloatId(10f);
            
            Integer id=sampleWebService.getInsertEmployeeOps(bug);
            System.out.println("Bug Insertion Message :::>>>"+id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
