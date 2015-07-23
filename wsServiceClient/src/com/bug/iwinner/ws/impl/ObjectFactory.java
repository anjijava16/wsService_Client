
package com.bug.iwinner.ws.impl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bug.iwinner.ws.impl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetInsertEmployeeOps_QNAME = new QName("http://impl.ws.iwinner.bug.com/", "getInsertEmployeeOps");
    private final static QName _GetBugDetailsOpsResponse_QNAME = new QName("http://impl.ws.iwinner.bug.com/", "getBugDetailsOpsResponse");
    private final static QName _GetBugDetailsOps_QNAME = new QName("http://impl.ws.iwinner.bug.com/", "getBugDetailsOps");
    private final static QName _GetUserMessageOps_QNAME = new QName("http://impl.ws.iwinner.bug.com/", "getUserMessageOps");
    private final static QName _GetUserMessageOpsResponse_QNAME = new QName("http://impl.ws.iwinner.bug.com/", "getUserMessageOpsResponse");
    private final static QName _Exception_QNAME = new QName("http://impl.ws.iwinner.bug.com/", "Exception");
    private final static QName _GetInsertEmployeeOpsResponse_QNAME = new QName("http://impl.ws.iwinner.bug.com/", "getInsertEmployeeOpsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bug.iwinner.ws.impl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link GetInsertEmployeeOpsResponse }
     * 
     */
    public GetInsertEmployeeOpsResponse createGetInsertEmployeeOpsResponse() {
        return new GetInsertEmployeeOpsResponse();
    }

    /**
     * Create an instance of {@link GetUserMessageOpsResponse }
     * 
     */
    public GetUserMessageOpsResponse createGetUserMessageOpsResponse() {
        return new GetUserMessageOpsResponse();
    }

    /**
     * Create an instance of {@link GetBugDetailsOps }
     * 
     */
    public GetBugDetailsOps createGetBugDetailsOps() {
        return new GetBugDetailsOps();
    }

    /**
     * Create an instance of {@link GetUserMessageOps }
     * 
     */
    public GetUserMessageOps createGetUserMessageOps() {
        return new GetUserMessageOps();
    }

    /**
     * Create an instance of {@link GetInsertEmployeeOps }
     * 
     */
    public GetInsertEmployeeOps createGetInsertEmployeeOps() {
        return new GetInsertEmployeeOps();
    }

    /**
     * Create an instance of {@link GetBugDetailsOpsResponse }
     * 
     */
    public GetBugDetailsOpsResponse createGetBugDetailsOpsResponse() {
        return new GetBugDetailsOpsResponse();
    }

    /**
     * Create an instance of {@link BugDTO }
     * 
     */
    public BugDTO createBugDTO() {
        return new BugDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInsertEmployeeOps }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws.iwinner.bug.com/", name = "getInsertEmployeeOps")
    public JAXBElement<GetInsertEmployeeOps> createGetInsertEmployeeOps(GetInsertEmployeeOps value) {
        return new JAXBElement<GetInsertEmployeeOps>(_GetInsertEmployeeOps_QNAME, GetInsertEmployeeOps.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBugDetailsOpsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws.iwinner.bug.com/", name = "getBugDetailsOpsResponse")
    public JAXBElement<GetBugDetailsOpsResponse> createGetBugDetailsOpsResponse(GetBugDetailsOpsResponse value) {
        return new JAXBElement<GetBugDetailsOpsResponse>(_GetBugDetailsOpsResponse_QNAME, GetBugDetailsOpsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBugDetailsOps }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws.iwinner.bug.com/", name = "getBugDetailsOps")
    public JAXBElement<GetBugDetailsOps> createGetBugDetailsOps(GetBugDetailsOps value) {
        return new JAXBElement<GetBugDetailsOps>(_GetBugDetailsOps_QNAME, GetBugDetailsOps.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserMessageOps }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws.iwinner.bug.com/", name = "getUserMessageOps")
    public JAXBElement<GetUserMessageOps> createGetUserMessageOps(GetUserMessageOps value) {
        return new JAXBElement<GetUserMessageOps>(_GetUserMessageOps_QNAME, GetUserMessageOps.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserMessageOpsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws.iwinner.bug.com/", name = "getUserMessageOpsResponse")
    public JAXBElement<GetUserMessageOpsResponse> createGetUserMessageOpsResponse(GetUserMessageOpsResponse value) {
        return new JAXBElement<GetUserMessageOpsResponse>(_GetUserMessageOpsResponse_QNAME, GetUserMessageOpsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws.iwinner.bug.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInsertEmployeeOpsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws.iwinner.bug.com/", name = "getInsertEmployeeOpsResponse")
    public JAXBElement<GetInsertEmployeeOpsResponse> createGetInsertEmployeeOpsResponse(GetInsertEmployeeOpsResponse value) {
        return new JAXBElement<GetInsertEmployeeOpsResponse>(_GetInsertEmployeeOpsResponse_QNAME, GetInsertEmployeeOpsResponse.class, null, value);
    }

}
