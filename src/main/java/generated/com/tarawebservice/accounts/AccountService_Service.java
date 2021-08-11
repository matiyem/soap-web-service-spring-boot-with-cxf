package generated.com.tarawebservice.accounts;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.4.4
 * 2021-08-06T13:28:53.797+04:30
 * Generated source version: 3.4.4
 *
 */
//این کلاس برای webService client است
@WebServiceClient(name = "AccountService",
                  wsdlLocation = "file:/G:/spring/soap-web-service-spring-boot-with-cxf/src/main/resources/wsdl/Accounts.wsdl",
                  targetNamespace = "http://www.taraWebService.com/Accounts/")
public class AccountService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.taraWebService.com/Accounts/", "AccountService");
    public final static QName AccountsPort = new QName("http://www.taraWebService.com/Accounts/", "AccountsPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/G:/spring/soap-web-service-spring-boot-with-cxf/src/main/resources/wsdl/Accounts.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AccountService_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/G:/spring/soap-web-service-spring-boot-with-cxf/src/main/resources/wsdl/Accounts.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public AccountService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AccountService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AccountService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public AccountService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public AccountService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public AccountService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns AccountService
     */
    @WebEndpoint(name = "AccountsPort")
    public AccountService getAccountsPort() {
        return super.getPort(AccountsPort, AccountService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AccountService
     */
    @WebEndpoint(name = "AccountsPort")
    public AccountService getAccountsPort(WebServiceFeature... features) {
        return super.getPort(AccountsPort, AccountService.class, features);
    }

}
