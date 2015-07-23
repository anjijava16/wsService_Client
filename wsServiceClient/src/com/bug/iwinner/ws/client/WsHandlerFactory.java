package com.bug.iwinner.ws.client;

import com.bug.iwinner.ws.impl.EmployeeServiceIF;

public class WsHandlerFactory {
	/*
public static void addLocation(){ 	
	
	HttpClient client = new HttpClient();
	PostMethod method = new PostMethod("http://localhost:3737/apacheWSDL/services/EmployeeServiceImplPort?wsdl");
	int returnCode = 0;
	try {
		returnCode=client.executeMethod(method);
	} catch (HttpException e) {
	} catch (IOException e) {
	}
	if(returnCode==200){
		EmployeeServiceImplService empServiceIF=new EmployeeServiceImplService(EmployeeServiceImplService.WSDL_LOCATION,EmployeeServiceImplService.SERVICE);
		EmployeeServiceIF locationServiceIF=empServiceIF.getEmployeeServiceImplPort();
		try {
			String message=locationServiceIF.getUserDetails("anji");
		} catch (Exception_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}*/
/*
public  static String deleteLocation(Integer locationId){
	String deleteLocation=LocationConstants.LOCATION_CHANGE_DEFAULT;
	HttpClient client = new HttpClient();
	PostMethod method = new PostMethod(LocationConstants.LOCATION_URL);
	int returnCode = LocationConstants.DEFAULT_VALUE;
	try {
		returnCode=client.executeMethod(method);
	} catch (HttpException e) {
	} catch (IOException e) {
	}
	if(returnCode==LocationConstants.HTTP_SUCCESS){
		LocationServiceWSImplService locationService=new LocationServiceWSImplService(LocationServiceWSImplService.WSDL_LOCATION,LocationServiceWSImplService.SERVICE);
		LocationService locationServiceIF=locationService.getLocationServiceWSImplPort();
		try {
			deleteLocation=locationServiceIF.deleteLocationOperation(locationId);
		} catch (WsException_Exception e) {
		}
		
	}else{
		deleteLocation=LocationConstants.UNABLE_CONNECT_SYSTEM;
	}
	return deleteLocation;
}
public static  Location searchLocation(Integer locationId){
	Location location=new Location();
	com.iwinner.location.ws.Location locationUnMa=new com.iwinner.location.ws.Location();
	HttpClient client = new HttpClient();
	PostMethod method = new PostMethod(LocationConstants.LOCATION_URL);
	int returnCode = LocationConstants.DEFAULT_VALUE;
	try {
		returnCode=client.executeMethod(method);
	} catch (HttpException e) {
	} catch (IOException e) {
	}
	if(returnCode==LocationConstants.HTTP_SUCCESS){
		LocationServiceWSImplService locationService=new LocationServiceWSImplService(LocationServiceWSImplService.WSDL_LOCATION,LocationServiceWSImplService.SERVICE);
		LocationService locationServiceIF=locationService.getLocationServiceWSImplPort();
		try {
			locationUnMa=locationServiceIF.searchLocationOperation(locationId);
		} catch (WsException_Exception e) {
		}
		location.setLocatioName(locationUnMa.getLocationName());
		location.setLocationId(locationUnMa.getLocationId());
	}else{
		location.setLocationId(LocationConstants.UNABLE_CONNECT_SYSTEM_);
	}
	return location;
}

public  static Integer update(Location location){
	Integer modifyLocation=LocationConstants.DEFAULT_VALUE;
	com.iwinner.location.ws.Location locationUnMa=new com.iwinner.location.ws.Location();
	locationUnMa.setLocationId(location.getLocationId());
	locationUnMa.setLocationName(location.getLocatioName()+LocationConstants.SEMICOLON+LocationConstants.UPDATE);
	HttpClient client = new HttpClient();
	PostMethod method = new PostMethod(LocationConstants.LOCATION_URL);
	int returnCode = LocationConstants.DEFAULT_VALUE;
	try {
		returnCode=client.executeMethod(method);
	} catch (HttpException e) {
	} catch (IOException e) {
	}
	if(returnCode==LocationConstants.HTTP_SUCCESS){
		LocationServiceWSImplService locationService=new LocationServiceWSImplService(LocationServiceWSImplService.WSDL_LOCATION,LocationServiceWSImplService.SERVICE);
		LocationService locationServiceIF=locationService.getLocationServiceWSImplPort();
		try {
		//	modifyLocation=locationServiceIF.modifyLocationOperation(locationId);
			modifyLocation=locationServiceIF.addLocationOperation(locationUnMa);
			
		} catch (WsException_Exception e) {
		}
	}else{
		modifyLocation=LocationConstants.UNABLE_CONNECT_SYSTEM_;
	}
	return modifyLocation;
}

public static List<Location> viewAllLocation(){
	List<Location> viewAllLocation=new ArrayList<Location>();
	List<com.iwinner.location.ws.Location> viewAllLocationMarsh=new ArrayList<com.iwinner.location.ws.Location>();
	HttpClient client = new HttpClient();
	PostMethod method = new PostMethod(LocationConstants.LOCATION_URL);
	int returnCode = LocationConstants.DEFAULT_VALUE;
	try {
		returnCode=client.executeMethod(method);
	} catch (HttpException e) {
	} catch (IOException e) {
	}
	if(returnCode==LocationConstants.HTTP_SUCCESS){
		LocationServiceWSImplService locationService=new LocationServiceWSImplService(LocationServiceWSImplService.WSDL_LOCATION,LocationServiceWSImplService.SERVICE);
		LocationService locationServiceIF=locationService.getLocationServiceWSImplPort();
		try {
			viewAllLocationMarsh=locationServiceIF.getAllLocationOperation();
			for(int i=0;i<viewAllLocationMarsh.size();i++){
				Location location=new Location();
				com.iwinner.location.ws.Location locationUnMa=(com.iwinner.location.ws.Location)viewAllLocationMarsh.get(i);
				location.setLocatioName(locationUnMa.getLocationName());
				location.setLocationId(locationUnMa.getLocationId());
				viewAllLocation.add(location);
			}
		} catch (WsException_Exception e) {
		}
	}
	
	return viewAllLocation;
}
*/
public static void main(String[] args) {
	try{
	org.apache.cxf.jaxws.JaxWsProxyFactoryBean clientFactory = new org.apache.cxf.jaxws.JaxWsProxyFactoryBean();             
	clientFactory.setAddress("http://localhost:3737/wsServices/services/employeeservice?wsdl"); 
	clientFactory.setServiceClass(EmployeeServiceIF.class); 
	clientFactory.setUsername("spotify"); 
	clientFactory.setPassword("spotify"); 
	EmployeeServiceIF locationServiceIF=(EmployeeServiceIF)clientFactory.create();
	String name=locationServiceIF.getUserMessageOps("anji");
	System.out.println("Name is "+name);
	}catch(Exception e){
		e.printStackTrace();
	}
}

/*public void successListService(){
	try{
	org.apache.cxf.jaxws.JaxWsProxyFactoryBean clientFactory = new org.apache.cxf.jaxws.JaxWsProxyFactoryBean();             
	clientFactory.setAddress("http://localhost:3737/apacheWSDL/services/BugWSServiceImplPort?wsdl"); 
	clientFactory.setServiceClass(BugDTOWSService.class); 
	clientFactory.setUsername("spotify123"); 
	clientFactory.setPassword("spotify"); 
	//javax.xml.ws.Service client1 = (javax.xml.ws.Service)clientFactory.create();
	BugDTOWSService locationServiceIF=(BugDTOWSService)clientFactory.create();
	List<BugDTO> listBug=locationServiceIF.getBugDetails();
	for(BugDTO bug:listBug){
		System.out.println(bug.getBugDesc()+"  "+bug.getBugName());
	}	
	}catch(Exception e){
		e.printStackTrace();
	}

}
*/}
