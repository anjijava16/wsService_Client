package com.bug.iwinner.ws.impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.16
 * 2015-07-23T14:12:13.224+08:00
 * Generated source version: 2.7.16
 * 
 */
@WebService(targetNamespace = "http://impl.ws.iwinner.bug.com/", name = "employeeServiceIF")
@XmlSeeAlso({ObjectFactory.class})
public interface EmployeeServiceIF {

    @WebResult(name = "getBugDetailsResponse", targetNamespace = "")
    @RequestWrapper(localName = "getBugDetailsOps", targetNamespace = "http://impl.ws.iwinner.bug.com/", className = "com.bug.iwinner.ws.impl.GetBugDetailsOps")
    @WebMethod
    @ResponseWrapper(localName = "getBugDetailsOpsResponse", targetNamespace = "http://impl.ws.iwinner.bug.com/", className = "com.bug.iwinner.ws.impl.GetBugDetailsOpsResponse")
    public java.util.List<com.bug.iwinner.ws.impl.BugDTO> getBugDetailsOps() throws Exception_Exception;

    @WebResult(name = "getUserMessageRespone", targetNamespace = "")
    @RequestWrapper(localName = "getUserMessageOps", targetNamespace = "http://impl.ws.iwinner.bug.com/", className = "com.bug.iwinner.ws.impl.GetUserMessageOps")
    @WebMethod
    @ResponseWrapper(localName = "getUserMessageOpsResponse", targetNamespace = "http://impl.ws.iwinner.bug.com/", className = "com.bug.iwinner.ws.impl.GetUserMessageOpsResponse")
    public java.lang.String getUserMessageOps(
        @WebParam(name = "username", targetNamespace = "")
        java.lang.String username
    ) throws Exception_Exception;

    @WebResult(name = "getInsertEmployeeResponse", targetNamespace = "")
    @RequestWrapper(localName = "getInsertEmployeeOps", targetNamespace = "http://impl.ws.iwinner.bug.com/", className = "com.bug.iwinner.ws.impl.GetInsertEmployeeOps")
    @WebMethod
    @ResponseWrapper(localName = "getInsertEmployeeOpsResponse", targetNamespace = "http://impl.ws.iwinner.bug.com/", className = "com.bug.iwinner.ws.impl.GetInsertEmployeeOpsResponse")
    public java.lang.Integer getInsertEmployeeOps(
        @WebParam(name = "bugDTO", targetNamespace = "")
        com.bug.iwinner.ws.impl.BugDTO bugDTO
    ) throws Exception_Exception;
}
